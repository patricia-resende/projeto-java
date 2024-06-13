package Animais;

public class Cachorro extends Animal{

        //atributos

        static int numeroDeCachorros;
        private int tamanhoDoRabo;


        //construtores

        public Cachorro(String nome, String cor, double peso) {
                super(nome, cor, peso);
        }


        //métodos


        public static int getNumeroDeCachorros() {
                return numeroDeCachorros;
        }

        public static void setNumeroDeCachorros(int numeroDeCachorros) {
                Cachorro.numeroDeCachorros = numeroDeCachorros;
        }

        public String getNome(){
                return this.nome = nome;
        }
        public void setNome(String nome){
                this.nome = nome;
        }

        public String getCor() {
                return cor;
        }

        public void setCor(String cor) {
                this.cor = cor;
        }

        public int getAltura() {
                return altura;
        }

        public void setAltura(int altura) {
                this.altura = altura;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public int getTamanhoDoRabo() {
                return tamanhoDoRabo;
        }

        public void setTamanhoDoRabo(int tamanhoDoRabo) {
                this.tamanhoDoRabo = tamanhoDoRabo;
        }

        public String getEstadoDeEspirito() {
                return estadoEspirito;
        }

        public void setEstadoDeEspirito(String estadoDeEspirito) {
                this.estadoEspirito = estadoDeEspirito;
        }



        public String pegar() {
                return "Bolinha";
        }
        public String interagir(String acao) {


                switch (acao){
                        case "carinho":this.estadoEspirito = "feliz"; break;
                        case "vai dormir":this.estadoEspirito = "bravo"; break;
                        case "pisar na patinha":this.estadoEspirito = "triste"; break;
                        default:this.estadoEspirito = "neutro";break;
                }
                return estadoEspirito;
        }

        @Override
        public String toString() {
                return "Cachorro{" +
                        "nome='" + nome + '\'' +
                        '}';
        }

        @Override
        public void soar() {
                System.out.println("AU AU");
        }
}