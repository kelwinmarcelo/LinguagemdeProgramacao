public class teste {
    public int contaVogais(String quantidade) {
        int quant = 0;
        for (int cont = 0; cont < quantidade.length(); cont++) {
            if (quantidade.charAt(cont) == 'a' || quantidade.charAt(cont) == 'e' || quantidade.charAt(cont) == 'i'
                    || quantidade.charAt(cont) == 'o' || quantidade.charAt(cont) == 'u'
                    || quantidade.charAt(cont) == 'A' || quantidade.charAt(cont) == 'E'
                    || quantidade.charAt(cont) == 'I' || quantidade.charAt(cont) == 'O'
                    || quantidade.charAt(cont) == 'U') {
                quant += 1;
            }
        }
        return quant;
    }
}
