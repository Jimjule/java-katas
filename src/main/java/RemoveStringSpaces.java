class RemoveStringSpaces {
    static String noSpace(final String x) {
        return String.join("", x.split(" "));
    }
}