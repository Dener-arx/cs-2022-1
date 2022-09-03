package Tarefa010.Ex2;

public class AgendaTeste {
    
	public static void main(String[] args) {

        Agenda agenda = new Agenda();
        
        agenda.addContato("Carlos", "Carlos@Email");
        agenda.addContato("Julia", "Julia@Email");
        agenda.addContato("Joao", "Joao@Email");
        agenda.addContato("Maria", "Maria@Email");
        agenda.addContato("Amanda", "Amanda@Email");
        agenda.addContato("Pedro", "Pedro@Email");
        agenda.addContato("Silvia", "Silvia@Email");

        agenda.listContatos();
        
        System.out.println("\nBusca 'Amanda'");
        Contato c = agenda.searchContato("Amanda");
        System.out.println(c.getNome() + " - " + c.getEmail());
        
        System.out.println("\nBusca 'Maria@Email'");
        c = agenda.searchContato("Maria@Email");
        System.out.println(c.getNome() + " - " + c.getEmail());
        
        System.out.println("\nRemove Maria e Pedro");
        agenda.removeContato("Maria");
        agenda.removeContato("Pedro");
        
        agenda.listContatos();
        
    }

}
