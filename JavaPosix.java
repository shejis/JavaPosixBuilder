public enum JavaPosix {

    lower("\\p{Lower}"),
    upper("\\p{Upper}"),
    ascii("\\p{ASCII}"),
    alpha("\\p{Alpha}"),
    digit("\\p{Digit}"),
    alnum("\\p{Alnum}"),
    punct("\\p{Punct}"),
    graph("\\p{Graph}"),
    print("\\p{Print}"),
    blank("\\p{Blank}"),
    cntrl("\\p{Cntrl}"),
    xdigit("\\p{XDigit}"),
    space("\\p{Space}"),
    word("\\p{IsWord}");

    public final String name;

    JavaPosix(String type) {
        name = type;
    }

    public String toString() {
        return this.name;
    }
}