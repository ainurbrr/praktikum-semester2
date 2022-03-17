#include <stdio.h>


int main(){

	int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int i=0, ganjil=0, genap=0, total=0;

	while(i < 10){
		
		if(arr[i]%2 == 1){
		 ganjil = ganjil + arr[i];
		}
		else if(arr[i]%2 == 0){
		 genap = genap + arr[i];
		}
		 total = total + arr[i];
		i++;
	}

	printf("Jumlah Bilangan Ganjil = %d\n", ganjil);
	printf("Jumlah Bilangan Genap = %d\n", genap);
	printf("Total = %d\n", total);
}
