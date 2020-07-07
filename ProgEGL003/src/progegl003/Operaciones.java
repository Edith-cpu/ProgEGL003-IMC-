package progegl003;

public class Operaciones {

    public static double calcularpeso(double Altura, double Peso) {
        double IMC = (double) Peso / (Math.pow(Altura, 2));
        return IMC;

    }

    public static void resultado(String Nombre, int Edad, double Altura, double Peso, double IMC) {
        if (IMC < 18.5) {
            Interfaz.jTextArea1.setText("Hola"+Nombre+"\nTu Edad es de "+Edad+"\nTu Atltura es de "+Altura+"\nTu Peso es de "+Peso+"\nTu peso es Bajo\nYa que tienes un Indice de Masa Corporal de:\n" + IMC + ".");
        }
        else if (IMC>=18.5 && IMC<=25) {
            Interfaz.jTextArea1.setText("Hola"+Nombre+"\nTu Edad es de "+Edad+"\nTu Atltura es de "+Altura+"\nTu Peso es de "+Peso+"\nTu peso es Normal\nYa que tienes un Indice de Masa Corporal de:\n" + IMC + ".");
        }
        else if(IMC>=25 && IMC <=30){
             Interfaz.jTextArea1.setText("Hola"+Nombre+"\nTu Edad es de "+Edad+"\nTu Atltura es de "+Altura+"\nTu Peso es de "+Peso+"\nTu peso es sobrepeso\nYa que tienes un Indice de Masa Corporal de:\n" + IMC + ".");
        }
        else if(IMC>30){
         Interfaz.jTextArea1.setText("Hola"+Nombre+"\nTu Edad es de "+Edad+"\nTu Atltura es de "+Altura+"\nTu Peso es de "+Peso+"\nTu peso es Normal\nYa que tienes un Indice de Masa Corporal de:\n" + IMC + ".");
        }
    }
}
