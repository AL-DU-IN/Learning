import java.io.*;
class P158
{
	void print(String M)throws IOException
	{
		System.out.println("The Encrypted Message is");
		System.out.println("");
		String S=M.toUpperCase();
		int x,m=S.length();
		char ch;
		int i,j;
		char a[][]=new char[7][7];
		for(x=0;x<m;++x)
		{
			ch=S.charAt(x);
			switch(ch)
			{
				case '1':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==3||i==6||(i+j)==3)
						{
							a[i][j]='1';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '2':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if((i==0)||(j==6&&i<=3)||i==3||(i==0&&j>=3)||(i==6)||(j==0&&i>=3))
						{
							a[i][j]='2';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '3':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==3||i==6||(j==6))
						{
							a[i][j]='3';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '4':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==3||j==6||(j==0&&i<=3))
						{
							a[i][j]='4';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case ('5'):
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==6||(j==0&&i<=3)||(j==6&&i>=3)||i==3)
						{
							a[i][j]='5';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '6':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||i==6||i==3||(j==6&&i>=3))
						{
							a[i][j]='6';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '7':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||(i+j)==6)
						{
							a[i][j]='7';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '8':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==6||j==0||j==6||i==3)
						{
							a[i][j]='8';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '9':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||j==6||i==3||(j==0&&i<=3))
						{
							a[i][j]='9';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '0':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||j==0||i==6||j==6)
						{
							a[i][j]='0';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '=':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==2||i==4)
						{
							a[i][j]='*';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case '+':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==3||j==3)
						{
							a[i][j]='*';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'A':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==3||j==0||j==6)
						{
							a[i][j]='a';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'B':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||j==6||i==6||i==3||j==0)
						{
							a[i][j]='b';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'C':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==6||j==0)
						{
							a[i][j]='c';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'D':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||j==0||i==6||j==6)
						{
							a[i][j]='d';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
					System.out.print(a[i][j]);
					}
				    System.out.println("");
				}
				System.out.println("");
				break;
				case 'E':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==3||i==6||j==0)
						{
							a[i][j]='e';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'F':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==3||j==0)
						{
							a[i][j]='f';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'G':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||j==0||(i==6&&j<=3)||(j==3&&i>=3)||(i==3&&j>=3)||(j==6&&i>=3))
						{
							a[i][j]='g';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'K':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||(i+j)==3||(i-j)==3)
						{
							a[i][j]='k';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'H':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||j==6||i==3)
						{
							a[i][j]='h';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'I':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==6||j==3)
						{
							a[i][j]='i';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'J':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||j==3||(i==6&&j<=3))
						{
							a[i][j]='j';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'L':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||i==6)
						{
							a[i][j]='L';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'M':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||j==6||(i<=3&&i==j)||(i<=3&&j+i==6))
							{
								a[i][j]='m';
							}
						}
					}
					for(i=0;i<7;++i)
					{
						for(j=0;j<7;++j)
						{
							System.out.print(a[i][j]);
						}
						System.out.println("");
					}
					System.out.println("");
					break;
					case 'N':
					for(i=0;i<7;++i)
					{
						for(j=0;j<7;++j)
						{
							a[i][j]=' ';
						}
					}
					for(i=0;i<7;++i)
					{
						for(j=0;j<7;++j)
						{
							if(j==0||j==6||i==j)
							{
								a[i][j]='n';
							}
						}
					}
					for(i=0;i<7;++i)
					{
						for(j=0;j<7;++j)
						{
							System.out.print(a[i][j]);
						}
						System.out.println("");
					}
					System.out.println("");
					break;
					case 'O':
					for(i=0;i<7;++i)
					{
						for(j=0;j<7;++j)
						{
						a[i][j]=' ';
						}
					}
					for(i=0;i<7;++i)
					{
						for(j=0;j<7;++j)
						{
							if(i==0||j==0||i==6||j==6)
							{
								a[i][j]='0';
							}
						}
					}
					for(i=0;i<7;++i)
					{
						for(j=0;j<7;++j)
						{
							System.out.print(a[i][j]);
						}
					  System.out.println("");
					}
				System.out.println("");
				break;
				case 'P':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||i==0||i==3||(j==6&&i<=3))
						{
							a[i][j]='p';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'Q':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||j==4||(i==0&&j<=4)||(i==6&&j<=4)||i==4)
						{
							a[i][j]='q';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'R':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||(i==0)||(j==6&&i<=3)||(i-j)==3||i==3)
						{
							a[i][j]='r';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'S':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==6||(j==0&&i<=3)||(j==6&&i>=3)||i==3)
						{
							a[i][j]='s';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'T':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||j==3)
						{
							a[i][j]='t';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'U':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==6||j==0||j==6)
						{
							a[i][j]='u';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'V':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if((i<=3&&i==j)||(i<=3&&i+j==6))
						{
							a[i][j]='v';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'W':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(j==0||j==6||(i>=3&&i==j)||(i>=3&&i+j==6))
						{
							a[i][j]='w';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'X':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==j||(i+j)==6)
						{
							a[i][j]='x';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'Y':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if((i<=3&&i==j)||(i<=3&&(i+j)==6||(j==3&&i>=3)))
						{
							a[i][j]='y';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				case 'Z':
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						a[i][j]=' ';
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						if(i==0||i==6||(i+j)==6)
						{
							a[i][j]='z';
						}
					}
				}
				for(i=0;i<7;++i)
				{
					for(j=0;j<7;++j)
					{
						System.out.print(a[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				break;
				default:if(ch!=' ')System.out.println("Give me a break");
			}
		}
	}
	void input()throws IOException
	{
		System.out.println("Enter the String");
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String M=k.readLine();
		print(M);
	}
	public static void main(String[]args)throws IOException
	{
		P158 r=new P158();
		r.input();
	}
}