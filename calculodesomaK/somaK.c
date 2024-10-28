#include <stdio.h>

int main() {
    int INDICE = 12;
    int SOMA = 0;
    int K = 1;

    while (K < INDICE) {
        K = K + 1;
        SOMA = SOMA + K;
    }

    printf("O valor da SOMA é: %d\n", SOMA); //vai printar o número 77
    return 0;
}
