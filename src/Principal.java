import java.util.Scanner;



public class Principal {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		entrada.useDelimiter("\n");
		PessoaFisica PessoaF = new PessoaFisica();
		PessoaJuridica PessoaJ= new PessoaJuridica();
		//Pessoa pessoa;
		int op;
		do {
			op = menu();
			switch (op) {
			case 1:
				
				
				System.out.println("Digite nome: ");
				PessoaF.setNome(entrada.next());
				System.out.println("Digite Endereco: ");
				PessoaF.setEndereco(entrada.next());
				System.out.println("Digite Telefone: ");
				PessoaF.setTelefone(entrada.next());
				System.out.println("Informe o  Sexo: ");
				PessoaF.setSexo(entrada.next());
				String CPF;

				System.out.printf("Informe o CPF: ");
				CPF = entrada.next();
                System.out.printf("\nResultado: ");
				if (Cpf.isCPF(CPF) == true){
					System.out.printf("%s\n", Cpf.imprimeCPF(CPF));
				}else{
					System.out.printf("Erro, CPF invalido !!!\n");
			}
		
				break;
			case 2:
				
				System.out.println("Digite nome: ");
				PessoaJ.setNome(entrada.next());
				System.out.println("Digite Endereco: ");
				PessoaJ.setEndereco(entrada.next());
				System.out.println("Digite Telefone: ");
				PessoaJ.setTelefone(entrada.next());
				System.out.println("Digite Inscricao Estadual: ");
				PessoaJ.setInscricaoEstadual(entrada.next());
				
				String cnpjvalido;
			
				System.out.printf("Informe o Cnpj: ");
				cnpjvalido = entrada.next();
                System.out.printf("\nResultado: ");
                
				if (Cnpj.isCnpjValido(cnpjvalido) == true){
					System.out.printf("%s\n", getcnpjvalido(cnpjvalido));
				}else{
					System.out.printf("Erro, CNPJ invalido !!!\n");
			}
		
				break;
			
			case 3:
				
				System.out.println("--------------------");
				System.out.println("Lista de Pessoa Fisica:");
				System.out.println( PessoaF.getNome()+"\n"+PessoaF.getEndereco()+"\n"+PessoaF.getTelefone()+"\n"+PessoaF.getSexo()+"\n"+PessoaF.getCpf());
		    break;
			case 4:		
		        
				System.out.println("___________________________________________");	
				System.out.println("Lista de Pessoa Juridica:");		
				System.out.println( PessoaJ.getNome()+"\n"+PessoaJ.getEndereco()+"\n"+PessoaJ.getTelefone()+"\n"+PessoaJ.getInscricaoEstadual()+"\n"+PessoaJ.getCnpj());
				
				break;
			
			case 5:
				
				System.out.println("--------------------");
				PessoaF  = null;
				PessoaJ =null;
				
				System.out.println("excluido");
				break;
			}
		} while (op != 6);
	};

	
	private static Object getcnpjvalido(String cnpjvalido) {
		// TODO Auto-generated method stub
		return null;
	}


	private static int menu() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("#####################################");
		System.out.println("1 - Incluir PessoaFisica");
		System.out.println("2 - Incluir PessoaJuridica");
		System.out.println("3 - listar pessoa fisica");
		System.out.println("4 - listar pessoa Juridica");
		System.out.println("5 - excluir");
		System.out.println("6 - sair");
		System.out.println("Digite a opcao desejada = ");
		return entrada.nextInt();
	}

	}


