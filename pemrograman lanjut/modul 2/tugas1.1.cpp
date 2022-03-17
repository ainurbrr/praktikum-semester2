#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char noHp[12];

char pulsa[5][10] = {"5000","10000","20000","15000","50000"};
char pulsaInput[5];

void login();
void cekNomorHp();
void cekPulsa();
void berhasil();
void dafftarPulsa();

int main(){
    login();
    return 0;
}

void login(){
    printf("Masukkan Nomor HP : ");
    gets(noHp);
    cekNomorHp();
    dafftarPulsa();
    printf("Masukan Pulsa : ");
    gets(pulsaInput);
    cekPulsa();
}

void cekNomorHp(){
    for (int i = 0; i < 12; i++){
        if(strlen(noHp)<12 || strlen(noHp)>12){
            printf("Nomor Hp yang dimasukan salah\n\n");
            login();
        }else if(noHp[i] >= 'A' && noHp[i] <= 'z'){
			printf("Nomor Hp Yang Dimasukkan Salah\n");
			login();
		}
    }
    
}

void cekPulsa(){
    for (int i = 0; i <= 5; i++){
        if(strcmp(pulsaInput, pulsa[i])==0){
            berhasil();
        }else{
            printf("Pulsa tidak ada\n\n");
            login();
        }
    }
    
}

void berhasil(){
    printf("\nSelamat transaksi berhasil");
    exit(0);
}

void dafftarPulsa(){
    printf("\nDaftar Pulsa :\n");
    for(int i = 0; pulsa[1][i] != '\0'; i++){
        printf("%d. %s\n", i+1, pulsa[i]);
    }
}
