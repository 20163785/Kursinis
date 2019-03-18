package Kursiniopagrprogkodas;


class Studentas {
    private long kodas;
    private String vardas, pavarde;

    public Studentas(long kodas, String vardas, String pavarde) {
        this.kodas = kodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String toString() {
        return kodas+" "+vardas.charAt(0)+". "+pavarde;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public long getKodas() {
        return kodas;
    }
    
}
