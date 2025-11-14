import java.util.Scanner;

public class ClassePrincipal {
	
	public static void limparTela() {
	    try {
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            System.out.print("\033[H\033[2J");
	            System.out.flush();
	        }
	    }catch (Exception e) {
            System.out.println("Erro ao limpar tela.");
        }
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do{
			
			limparTela();
			System.out.println("MENU DE OPÇÃO"); //sysout + ctrl + space
			System.out.println("[1] Adicionar um aluno");
			System.out.println("[2] Excluir um aluno");
			System.out.println("[3] Ver alunos");
			System.out.println("[4] SAIR");
				
			opcao = sc.nextInt();
			sc.nextLine();
			
			limparTela();
			
			switch(opcao){
			
			case 1:
				System.out.println("Selecionado opção 1");
				System.out.println("Informe o nome:");
				String nome = sc.nextLine();
				System.out.println("Informe o CPF:");
				String cpf = sc.nextLine();
				System.out.println("Informe o curso:");
				String curso = sc.nextLine();
				System.out.println("Cadastra nome, cpf e curso");
				break;
				
			case 2:
				System.out.println("Selecionado opção 2");
			case 3:
				System.out.println("Selecionado opção 3");
			default:
				System.out.println("Opção Padrão");
			}	
			
		} while(opcao != 4);		
		
	}

}
