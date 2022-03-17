#include <stdio.h>

int find(int x, int arr[]){
	int i;
	
	while (i < 100){
		if(arr[i] == x){
		break;
		}
	}
	return -1;
}

int main(){
	int array[100] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	if(find(9, array)==-1){
	 puts("Angka ada di array!");}
	else{
	 puts("Angka tidak ada di array!");}
	 
	return 0;
}
