package Controles.Control03;

public class Teclado {
    
    private static int totalTeclados = 0;

    private String color;
    private int num_teclas;
    private String conectividad;
    private String idioma;
    private String formato;

    //private static final String[] Conectividad = {"Inalambrico","Cable"};

    public static void saberNumeroTeclados(){
        System.out.println("Total de teclados: " + totalTeclados);
    }
    
    public Teclado(String color, int num_teclas, String conectividad, String idioma, String formato) {
        this.color = color;
        this.num_teclas = num_teclas;
        if (conectividad == "Inalambrico" || conectividad == "Cable") {
            this.conectividad = conectividad;
        }else{
            this.conectividad = "Tiene que ser o Inalambrico o Cable";
        }
        if (idioma.length() == 2) {
            this.idioma = idioma;
        }else{
            this.idioma = "Tiene que tener dos caracteres, por ejemplo: 'es'";
        }
        if (formato == "Compacto" || formato == "Extendido") {
            this.formato = formato;
        }else{
            this.formato = "Tiene que ser Compacto o Extendido";
        }
        totalTeclados++;
    }

    public Teclado() {
        this.color = "Negro";
        this.num_teclas = 52;
        this.conectividad = "Inalambrico";
        this.idioma = "es";
        this.formato = "Compacto";
        totalTeclados++;
    }

    public String getColor() {
        return color;
    }

    public int getNum_teclas() {
        return num_teclas;
    }

    public String getConectividad() {
        return conectividad;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getFormato() {
        return formato;
    }   
}