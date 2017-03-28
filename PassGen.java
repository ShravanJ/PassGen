/**
*	PassGen - a fast, pseudo-random variable length password generator written in Java
*	@author Shravan Jambukesan
*	Source: https://github.com/ShravanJ/PassGen
*	***NOTICE: NOT INTENDED FOR SENSITIVE USE, YOU ASSUME ALL RISK OF USING THIS PROGRAM***
*/

import java.util.*;

public class PassGen
{
	public static void main(String[] args) 
	{
		System.out.println("PassGen - a fast, pseudo-random variable length password generator");
		System.out.println("***WARNING: RANDOMNESS IS NOT GUARENTEED, USE WITH CAUTION***");
		System.out.println("Developed by Shravan Jambukesan (https://github.com/ShravanJ/PassGen)");
		Boolean exit = false;
		Scanner scan = new Scanner(System.in);
		while(!exit)
		{
			System.out.print("Press enter to generate password or press q to exit: ");
			String input = scan.nextLine();
			if(input.isEmpty())
			{
				System.out.println("Generated password: " + password());
				System.out.println();	
			}
			else if(input.equals("q"))
			{
				exit = true;
			}
			else
			{
				System.out.println("Invalid input");
			}

		}	
	}

	public static String password()
	{
		//random integer init
		String pass = "";
		int x = 1;
		int y = 1;
		int z = 1;

		//random alpha chars init
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		String e = "";
		String f = "";

		//random special chars init
		String g = "";
		String h = "";

		//random ranges
		int alphaRandRange = 26;
		int specRandRange = 8;

		//arrays to store chars
		char alphabet[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char spec[] = "!@#$%&*".toCharArray();

		//random population of alpha chars
		for(int i = 0; i < (int)(Math.random() * alphaRandRange); i++)
		{
			a = Character.toString(alphabet[i]);
		}

		for(int i = 0; i < (int)(Math.random() * alphaRandRange); i++)
		{
			b = Character.toString(alphabet[i]);
		}

		for(int i = 0; i < (int)(Math.random() * alphaRandRange); i++)
		{
			c = Character.toString(alphabet[i]);
		}

		for(int i = 0; i < (int)(Math.random() * alphaRandRange); i++)
		{
			d = Character.toString(alphabet[i]);
		}

		for(int i = 0; i < (int)(Math.random() * alphaRandRange); i++)
		{
			e = Character.toString(alphabet[i]);
		}

		for(int i = 0; i < (int)(Math.random() * alphaRandRange); i++)
		{
			f = Character.toString(alphabet[i]);
		}

		//rando population of special chars
		for(int i = 0; i < (int)(Math.random() * specRandRange); i++)
		{
			g = Character.toString(spec[i]);
		}

		for(int i = 0; i < (int)(Math.random() * specRandRange); i++)
		{
			h = Character.toString(spec[i]);
		}

		//generates random value for x
		while (x == x)
		{
			x++;
			if (x > (int) (Math.random() * 1000) + 1)
			{
				break;
			}
		}
		//generates random value for y
		while (y == y)
		{
			y++;
			if (y > (int) (Math.random() * 1000) + 1)
			{
				break;
			}
		}
		//generates random value for z
		while (z == z)
		{
			z++;
			if (z > (int) (Math.random() * 1000) + 1)
			{
				break;
			}
		}
		
		//(pseudo) random password string generation
		if (x < 50)
		{
			pass = e + c + b + x + y + h + g + d + a + f + z;
		}
		else if (y > 80)
		{
			pass = c + b + a + x + y + z + f + d + e + g + h;

		}
		else if(z < 10)
		{
			pass = h + f + e + d + g + z + y + x + c + b + a;
		}
		else
		{
			pass = a + b + c + x + y + z + g + d + e + f + h;
		}

		return pass;
	}
}


 

