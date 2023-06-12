public enum Gender {

    MAN("Férfi", "UOMO"),
    WOMAN("Nő", "DONNA"),
    ;

    private String magyarNev;
    private String olaszNev;

    Gender(String magyarNev, String olaszNev) {
        this.magyarNev = magyarNev;
        this.olaszNev = olaszNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public String getOlaszNev() {
        return olaszNev;
    }

}
