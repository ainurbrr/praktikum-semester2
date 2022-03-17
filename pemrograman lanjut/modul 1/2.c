#include <stdio.h>
#include <string.h>

int main(){

	char NIM[20];
	int panjang;
	
	while(0<10){
	
		printf("Masukkan nim anda : ");
		scanf("%s", &NIM);
		
		panjang = strlen(NIM);
		if(strcmp(NIM,"202010370311443")==0){
			printf("Nim sudah benar");
			break;
		}else if(panjang<15){
			printf("Error!!!\nNim kurang dari 15 digit\n");
			continue;
		}else if(panjang>15){
			printf("Error!!!\nNim lebih dari 15 digit\n");
			continue;
		}else{
			printf("Nim yang anda masukkan salah\n");
			continue;
		}
	}
	
	return 0;
}
