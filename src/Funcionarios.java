public class Funcionarios {
    private String nome;
    private double salariobase;
    private int horasTrabalhadas;

    public Funcionarios(String nome, double salariobase, int horasTrabalhadas) {
        this.nome = nome;
        this.salariobase = salariobase;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double calcularSalarioFinal(){
        int horasNormais = 160;
        double valorHora = salariobase / horasNormais;
        if (horasTrabalhadas > horasNormais){
            int horasExtras = horasTrabalhadas - horasNormais;
            return salariobase + (horasExtras * valorHora * 1.5);
        }
        return salariobase;
    }
    public void exibirDados(){
        System.out.printf("Funcionário: %s\n", nome);
        System.out.printf("Salário base: %.2f\n", salariobase);
        System.out.printf("Horas trabalhadas: %d\n", horasTrabalhadas);
        System.out.printf("Salário final: %.2f\n", calcularSalarioFinal());
        System.out.printf("-----------------------\n");
    }
}
