package chapters.chapter12.language;

public enum Language {
    HY("Armenia"),
    RU("Russia"),
    ENG();
    private String country;

    Language(String country) {
        this.country = country;
    }
    Language(){
    }

    public String getCountry() {
        return country;
    }
}
