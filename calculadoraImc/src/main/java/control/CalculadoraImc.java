package control;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {
        double imc = peso/(altura*altura);

        if(idade > 20 && idade < 65 && peso/(altura*altura) < 16){
            return ("Baixo peso muito grave");
        }

        if(idade > 20 && idade < 65 && peso/(altura*altura) >= 16 || peso/(altura*altura) <= 16.9 ){
            return ("Baixo peso grave");
        }

        if(idade > 20 && idade < 65 && peso/(altura*altura) >= 17 || peso/(altura*altura) <= 18.4 ){
            return ("Baixo peso");
        }

        if(idade > 20 && idade < 65 && peso/(altura*altura) >= 18.5 || peso/(altura*altura) <= 24.9 ){
            return ("Peso normal");
        }

        if(idade > 20 && idade < 65 && peso/(altura*altura) >= 25 || peso/(altura*altura) <= 29.9 ){
            return ("Sobre peso");
        }

        if(idade > 20 && idade < 65 && peso/(altura*altura) >= 30 || peso/(altura*altura) <= 34.9 ){
            return ("Obesidade Grau 1");
        }

        if(idade > 20 && idade < 65 && peso/(altura*altura) >= 35 || peso/(altura*altura) <= 39.9 ){
            return ("Obesidade Grau 2");
        }

        if(idade > 20 && idade < 65 && peso/(altura*altura) > 40 ){
            return ("Obesidade Grau 3");
        }

        if(idade > 65 && sexo.equals("feminino") && peso/(altura*altura) < 21.9){
            return ("Baixo peso");
        }

        if(idade > 65 && sexo.equals("feminino") && peso/(altura*altura) >= 22 || peso/(altura*altura) <= 27){
            return ("Peso normal");
        }

        if(idade > 65 && sexo.equals("feminino") && peso/(altura*altura) >= 27.1 || peso/(altura*altura) <= 32){
            return ("Sobre peso");
        }

        if(idade > 65 && sexo.equals("feminino") && peso/(altura*altura) >= 32.1 || peso/(altura*altura) <= 37){
            return ("Obesidade Grau 1");
        }

        if(idade > 65 && sexo.equals("feminino") && peso/(altura*altura) >= 37.1 || peso/(altura*altura) <= 41.9){
            return ("Obesidade Grau 2");
        }

        if(idade > 65 && sexo.equals("feminino") && peso/(altura*altura) >= 42){
            return ("Obesidade Grau 3");
        }

        if(idade > 65 && sexo.equals("masculino") && peso/(altura*altura) < 21.9){
            return ("Baixo peso");
        }

        if(idade > 65 && sexo.equals("masculino") && peso/(altura*altura) >= 22 || peso/(altura*altura) <= 27){
            return ("Peso normal");
        }

        if(idade > 65 && sexo.equals("masculino") && peso/(altura*altura) >= 27.1 || peso/(altura*altura) <= 30){
            return ("Sobre peso");
        }

        if(idade > 65 && sexo.equals("masculino") && peso/(altura*altura) >= 30.1 || peso/(altura*altura) <= 35){
            return ("Obesidade Grau 1");
        }

        if(idade > 65 && sexo.equals("masculino") && peso/(altura*altura) >= 35.1 || peso/(altura*altura) <= 39.9){
            return ("Obesidade Grau 2");
        }

        if(idade > 65 && sexo.equals("masculino") && peso/(altura*altura) >= 40){
            return ("Obesidade Grau 3");
        }

        if((idade == 2) && (imc < 15)){
            return ("Baixo peso");
        }

        if((idade == 2) && (imc < 18)){
            return ("Peso normal");
        }

        if(idade == 2 && (imc < 19)){
            return ("Sobre peso");
        }

        if(idade == 2 && (imc < 19.1)){
            return ("Obesidade");
        }

        if((idade == 4) && (imc < 15.5)){
            return ("Baixo peso");
        }

        if((idade == 4) && (imc < 17)){
            return ("Peso normal");
        }

        if((idade == 4) && (imc < 18)){
            return ("Sobre peso");
        }

        if((idade == 4) && (imc < 18.2)){
            return ("Obesidade");
        }

        if((idade == 6) && (imc < 15.5)){
            return ("Baixo peso");
        }

        if((idade == 6) && (imc < 17)){
            return ("Peso normal");
        }

        if((idade == 6) && (imc < 18)){
            return ("Sobre peso");
        }

        if((idade == 6) && (imc < 18.2)){
            return ("Obesidade");
        }

        if((idade == 8) && (imc < 15.5)){
            return ("Baixo peso");
        }

        if((idade == 8) && (imc < 17)){
            return ("Peso normal");
        }

        if((idade == 8) && (imc < 18)){
            return ("Sobre peso");
        }

        if((idade == 8) && (imc < 18.2)){
            return ("Obesidade");
        }

        if((idade == 10) && (imc < 15)){
            return ("Baixo peso");
        }

        if((idade == 10) && (imc < 18)){
            return ("Peso normal");
        }

        if((idade == 10) && (imc < 22)){
            return ("Sobre peso");
        }

        if((idade == 10) && (imc < 24)){
            return ("Obesidade");
        }

        if((idade == 12) && (imc < 15)){
            return ("Baixo peso");
        }

        if((idade == 12) && (imc < 20)){
            return ("Peso normal");
        }

        if((idade == 12) && (imc < 24)){
            return ("Sobre peso");
        }

        if((idade == 12) && (imc < 26)){
            return ("Obesidade");
        }
        return "Informe valores validos";
    }


}