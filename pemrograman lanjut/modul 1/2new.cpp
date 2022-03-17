#include <string.h>
#include <conio.h>
#include <stdio.h>
#include <iostream>

int main(){

	char NIM[20];
	int panjang;
	try{
	while(0<100){
	
		printf("Masukkan nim anda : ");
		scanf("%s", &NIM);
		
		panjang = strlen(NIM);
		if(strcmp(NIM,"202010370311443")==0){
			printf("Nim sudah benar");
			break;
		}else if(panjang<15){
			printf("Error!!!\nNim kurang dari 15 digit\n");
			throw NIM;
			
		}else if(panjang>15){
			printf("Error!!!\nNim lebih dari 15 digit\n");
			throw NIM;
			
		}else{
			printf("error\nNim yang anda masukkan salah!\n");
			
			continue;
		}
	}
	}catch(char x[20]){
	printf("inputan yang salah adalah %s", x);
	}
	return 0;
}
