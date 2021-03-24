Public class Employee {

    String name;
    String address;
    double timeCard;

    public Employee(String name, String address, double timeCard){
        this.name = name;
        this.address = address;
        this.timeCard = timeCard;
    }

    public String printEmployeeInfo(){
        return "Name: "+ this.name +
                "\nAdress: " + this.address +
                 "\nTime Card: " + this.timeCard;
    }
    //this = employee1;
    //employee = employee2

    Public String printEmployeeInfo(Employee employee){
        return "Name: " + this.name +
                "\nAdress: " + this.address +
                "\nTime Card: " + this.timeCard +
                "\n----------------------------" +
                "\nName: " + employee.name +
                "\nAdress: " + employee.address +
                "\nTime Card: " + employee.timeCard;
    }
}

Public class pagamento {

    String tipo_pagamento;
    String data_pagamento;

}

public class comissionado {
    int qtd_vendas;
}

public class assalariado {
    int salario;
    int qtd_hora_extra;
}

public class ponto{
    int horas_trabalhadas;
}

public class horista {
    int qtd_horas;
}

public class sindicato {
    int valor_taxa;

}

public class taxas {
    String serviço_realizado;
    int valor_serviço;
    String idt_empregado_sindicato
}

public class contracheque {
    String deducoes;
    int salario_final;
}