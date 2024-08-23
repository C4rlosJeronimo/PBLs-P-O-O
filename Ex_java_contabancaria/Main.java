import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco");
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastre sua conta");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Extrato");
            System.out.println("5. Alterar informações de cadastro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCliente(banco, scanner);
                    break;
                case 2:
                    realizarSaque(banco, scanner);
                    break;
                case 3:
                    realizarDeposito(banco, scanner);
                    break;
                case 4:
                    exibirExtrato(banco, scanner);
                    break;
                case 5:
                    alterarInformacoesCadastrais(banco, scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }

    private static void cadastrarCliente(Banco banco, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, dataNascimento, telefone, email);
        ContaBancaria conta = new ContaBancaria(cliente);
        banco.adicionarConta(conta);

        System.out.println("Cliente cadastrado!");
        System.out.println("Número da sua conta: " + conta.getNumero());
    }

    private static void realizarSaque(Banco banco, Scanner scanner) {
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        ContaBancaria conta = banco.encontrarConta(numeroConta);

        if (conta != null) {
            System.out.print("Valor do saque: ");
            double valor = scanner.nextDouble();
            conta.sacar(valor);
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void realizarDeposito(Banco banco, Scanner scanner) {
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        ContaBancaria conta = banco.encontrarConta(numeroConta);

        if (conta != null) {
            System.out.print("Valor do depósito: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void exibirExtrato(Banco banco, Scanner scanner) {
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        ContaBancaria conta = banco.encontrarConta(numeroConta);

        if (conta != null) {
            conta.exibirExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void alterarInformacoesCadastrais(Banco banco, Scanner scanner) {
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        ContaBancaria conta = banco.encontrarConta(numeroConta);

        if (conta != null) {
            Cliente cliente = conta.getCliente();

            System.out.print("Novo nome para sua conta (atual: " + cliente.getNome() + "): ");
            String nome = scanner.nextLine();
            if (!nome.isEmpty()) cliente.setNome(nome);

            System.out.print("Novo CPF (atual: " + cliente.getCpf() + "): ");
            String cpf = scanner.nextLine();
            if (!cpf.isEmpty()) cliente.setCpf(cpf);

            System.out.print("Nova data de nascimento (atual: " + cliente.getDataNascimento() + "): ");
            String dataNascimento = scanner.nextLine();
            if (!dataNascimento.isEmpty()) cliente.setDataNascimento(dataNascimento);

            System.out.print("Novo telefone (atual: " + cliente.getTelefone() + "): ");
            String telefone = scanner.nextLine();
            if (!telefone.isEmpty()) cliente.setTelefone(telefone);

            System.out.print("Novo email (atual: " + cliente.getEmail() + "): ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) cliente.setEmail(email);

            System.out.println("Informações cadastrais atualizadas com sucesso!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
