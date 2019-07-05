public class PosixRegexBuilder {

    public static final String EMPTY_STRING = "";
    public static final String POSIX_SLICER_PATTER = "[::]";
    public static final String OPEN_SQUARE_BRACKET = "[";
    public static final String CLOSED_SQUARE_BRACKET = "]";

    public static boolean checkRegexIsPosix(String regex){
        String splitRegEx[] = regex.split(POSIX_SLICER_PATTER);
        if (splitRegEx.length > 1) {
            return true;
        }
        return false;
    }

    public static String javaPosixBuilder(String regex){
        String javaPosix = EMPTY_STRING;
        String splitRegEx[] = regex.split(POSIX_SLICER_PATTER);

        for (String regEx:splitRegEx) {
            String posixJavaValue;
            try {
                JavaPosix PosixVar = JavaPosix.valueOf(regEx);
                posixJavaValue = PosixVar.toString();
            }catch (Exception e){
                posixJavaValue = EMPTY_STRING;
            }
            if (posixJavaValue.length() == 0) {
                posixJavaValue = posixJavaValue + subStringParser(regEx);
            }
            javaPosix = javaPosix + posixJavaValue;
        }
        return javaPosix;
    }

    private static String subStringParser(String subString){
        String charVal[] = subString.split(EMPTY_STRING);
        String filteredValue = EMPTY_STRING;
        if (charVal.length > 0) {
            for (String value:charVal) {
                filteredValue = filteredValue + filterCharacter(value);
            }
        }
        return filteredValue;
    }

    private static  String filterCharacter(String charVal){
        if(charVal.equals(OPEN_SQUARE_BRACKET)){
            return EMPTY_STRING;
        }else if (charVal.equals(CLOSED_SQUARE_BRACKET)){
            return EMPTY_STRING;
        }
        return charVal;

    }
}
