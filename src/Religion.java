public enum Religion {
    ROMAN_CATHOLIC("római katolikus", "römisch katholisch"),
    GREEK_CATHOLIC("görög katolikus", "griechisch katholisch"),
    CALVINISTIC("református", "reformiert"),
    LUTHERAN("evangélikus", "lutheraner"),
    JEWISH("zsidó", "jüdisch"),
    ;


    private String magyarNev;
    private String nemetNev;

    Religion(String magyarNev, String nemetNev) {
        this.magyarNev = magyarNev;
        this.nemetNev = nemetNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public String getNemetNev() {
        return nemetNev;
    }
}
