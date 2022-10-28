class Cadastro{
public static void main(String args[]){
Cliente vinicius = new Cliente();
vinicius.nome = "Vinicius Rodrigues do Prado Rosa";
vinicius.email = "vinicius3411@gmail.com";
vinicius.telefone = "+55 16 9996624258";
vinicius.CPF = "424.356.068-42";
vinicius.endereço = "Rua peru, 380";
vinicius.placa = "MXK-1496";
vinicius.modelo = "Chevrolet Vectra 2.0 Mpfi Gt Hatch 8v Flex 4p Manual";
vinicius.ano = 2010;
vinicius.fabricante = "chevrolet";
vinicius.cor = "prata";


System.out.println("nome: " + vinicius.nome + "\ne-mail: " + vinicius.email + "\nTelefone: " + vinicius.telefone + "\nnúmero de CPF: " + vinicius.CPF + "\nEndereço: " + vinicius.endereço + "\nModelo do carro: " + vinicius.modelo + "\nPlaca: " + vinicius.placa + "\nAno: " + vinicius.ano + "\nFabricante: " + vinicius.fabricante + "\nCor: " + vinicius.cor);
  }
}

