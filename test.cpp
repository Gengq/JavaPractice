#include <iostream>
#include <cstdio>
#include <string>
using namespace std;

int main(){
	char a[4] = "了";
	printf("%#x%#x%#x",a[0],a[1],a[2]);
	printf("\n%c",a[3]);
}
