#include <stdio.h>
#include <string.h>

void cekName(char *name); 
void cekForm(char *from);
void cekDate(int date);
void list();

char book[10][100] = {{"A Book, Malang. 2021"}};
char place[][10] = {{"Malang"},{"Batu"},{"Surabaya"}};

int main(){
    char inName[20], inForm[10], name[50];
    int inDate;
    printf("Welcome\nInput Book = \n");
    printf("Nama : ");
    scanf("%s", &inName);
    cekName(inName);
    printf("From : ");
    scanf("%s", &inForm);
    cekForm(inForm);
    printf("Date : ");
    scanf("%d", &inDate);
    cekDate(inDate);
    sprintf(name, "%s, %s. %d", inName, inForm, inDate);
    strcpy(book[1], name);
    printf("Menambahkan Buku Sukses!");
    return 0;
}

void cekDate(int date){
    if(date <= 2018 || date >= 2021){

    }
}

void cekForm(char from[10]){
    for(int i = 0; place[i][0] != '\0'; i++){
        if(strcmp(from, place[i]) == 0){

        }
    }
}

void cekName(char name[10]){
    for(int i = 0; book[i][0] != '\0'; i++){
        if(strcmp(name, book[i]) == 0){

        }
    }
}

void list(){
    for(int i = 0; book[i][0] != '\0'; i++){
        printf("\n%s", book[i]);
    }
}
