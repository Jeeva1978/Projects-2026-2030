package gymplanner;
import java.util.Scanner;
class detail{
	static void printline()
	{
		for(int i=0;i<=156;i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	String name ;
	int age ;
	double height;
	double weight;
	String gymb;
	String activity;
	detail(String n, int a, double h, double w,String g,String ac)
	{
		name =n;
		age =a;
		height=h;
		weight=w;
		gymb = g;
		activity = ac;
	}
	detail()
	{
		
	}
}
class work4{
	String workout;
	String compwork1;
	String compwork2;
	String compwork3;
	String isolwork1;
	String isolwork2;
	String isolwork3;
	String[] workout4 = new String[4];
	work4(String workout,String compwork1,String compwork2,String compwork3,String isolwork1,String isolwork2,String isolwork3)
	{
		Scanner scan = new Scanner(System.in);
		detail obj1 = new detail();
		System.out.println(" "+workout);
		System.out.println("total 4 workout movement");
		obj1.printline();
		System.out.println("pick 2 compound movement ");
		obj1.printline();
		System.out.println("COMPOUND MOVEMENT");
		obj1.printline();
		System.out.println("1. "+compwork1);
		System.out.println("2. "+compwork2);
		System.out.println("3. "+compwork3);
		obj1.printline();
		System.out.println("pick 2 isolation movement ");
		System.out.println("ISOLATION MOVEMENT");
		obj1.printline();
		System.out.println("1. "+isolwork1);
		System.out.println("2. "+isolwork2);
		System.out.println("3. "+isolwork3);
		obj1.printline();
		System.out.print("enter the comp movement 1 :-");
		workout4[0] = scan.nextLine();
		System.out.print("enter the comp movement 2 :-");
		workout4[1] = scan.nextLine();
		obj1.printline();
		System.out.print("enter the iso movement 1 :-");
		workout4[2] = scan.nextLine();
		System.out.print("enter the iso movement 2 :-");
		workout4[3] = scan.nextLine();
		obj1.printline();
	}
}
class work3{
	String workout;
	String compmovement1;
	String compmovement2;
	String isolwork1;
	String isolwork2;
	String isolwork3;
	String[] workout3 = new String[3];
	work3(String workout,String compmovement1,String compmovement2,String isolwork1,String isolwork2,String isolwork3)
	{
		Scanner scan = new Scanner(System.in);
		detail obj1 = new detail();
		System.out.println(" "+workout );
		obj1.printline();
		System.out.println("pick 3 exercise movement ");
		System.out.println("EXERCISE MOVEMENT");
		obj1.printline();
		System.out.println("COMPOUND MOVEMENT");
		obj1.printline();
		System.out.println("1. "+compmovement1);
		System.out.println("2. "+compmovement2);
		obj1.printline();
		System.out.println("ISOLATION MOVEMENT");
		obj1.printline();
		System.out.println("3. "+isolwork1);
		System.out.println("4. "+isolwork2);
		System.out.println("5. "+isolwork3);
		obj1.printline();
		System.out.print("enter the comp movement 1 :-");
		workout3[0] = scan.nextLine();
		obj1.printline();
		System.out.print("enter the iso movement 1 :-");
		workout3[1] = scan.nextLine();
		System.out.print("enter the iso movement 2 :-");
		workout3[2] = scan.nextLine();
		obj1.printline();
	}
}
class work2{
	String workout;
	String isolwork1;
	String isolwork2;
	String isolwork3;
	String isolwork4;
	String[] workout2 = new String[2];
	work2(String workout,String isolwork1,String isolwork2,String isolwork3,String isolwork4)
	{
		Scanner scan = new Scanner(System.in);
		detail obj1 = new detail();
		System.out.println(" "+workout );
		obj1.printline();
		System.out.println("pick 2 exercise movement ");
		System.out.println("EXERCISE MOVEMENT");
		obj1.printline();
		System.out.println("1. "+isolwork1);
		System.out.println("2. "+isolwork2);
		System.out.println("3. "+isolwork3);
		System.out.println("4. "+isolwork4);
		obj1.printline();
		System.out.print("enter the iso movement 1 :-");
		workout2[0] = scan.nextLine();
		System.out.print("enter the iso movement 2 :-");
		workout2[1] = scan.nextLine();
		obj1.printline();
	}
}
class work1{
	String workout;
	String isolwork1;
	String isolwork2;
	String[] workout1 = new String[1];
	work1(String workout,String isolwork1,String isolwork2)
	{
		Scanner scan = new Scanner(System.in);
		gymplanner obj1 = new gymplanner();
		System.out.println(" "+workout );
		obj1.printline();
		System.out.println("pick 1 exercise movement ");
		System.out.println("EXERCISE MOVEMENT");
		obj1.printline();
		System.out.println("1. "+isolwork1);
		System.out.println("2. "+isolwork2);
		System.out.print("enter the iso movement 1 :-");
		workout1[0] = scan.nextLine();
		obj1.printline();
	}
}
public class gymplanner {
	static void printline()
	{
		for(int i=0;i<=156;i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	double bmi(double h,double w)
	{
		double bmi = w/((h/100)*(h/100));
		return bmi;
	}
	String body_type(Scanner san,String n,double fb)
	{
		gymplanner obj1 = new gymplanner();
		obj1.printline();
		System.out.println(" SETTING   THE   GOAL ");
		if(fb<18.5)
		{
			obj1.printline();
			System.out.println("recommand : "+n+" your at under weight ");
			System.out.println("you have extra weight with less of body fat you need to bulk(don't to cut)");
			return "bulk";
		}
		else if(18.5<fb && 22>=fb )
		{
			obj1.printline();
			System.out.println("recommand : "+n+" your at normal weight ");
			System.out.println("your have 1.bulk , 2.body recomposition ( not recommand ) , 3.cut( not recommand)");
			System.out.println("enter (1/2/3)");
			int a = san.nextInt();
			san.nextLine();   
			if(a==1)
			{
				return"bulk";
			}
			else if(a==2)
			{
				return "body recomposition";
			}
			else if(a==3) 
			{
				return "cut";
			}
			else {
				System.out.println("please try later please retry the programm");
				return "try again";
			}
		}
		else if(22<fb && 28.5 >fb)
		{
			obj1.printline();
			System.out.println("recommand : "+n+" your at normal weight ");
			System.out.println("you have 1.body recomposition ,2. bulk ,3. lean cut (not recommand) :- ");
			System.out.println("enter (1/2/3)");
			int a = san.nextInt();
			san.nextLine();   
			if(a==1)
			{
				return"body recomposition";
			}
			else if(a==2)
			{
				return "bulk";
			}
			else if(a==3) 
			{
				return "cut";
			}
			else {
				System.out.println("please try later please retry the programm");
				return "try again";
			}
		}	
		else if(fb>28.5 && 30>fb)
		{
			obj1.printline();
			System.out.println("recommand : "+n+" your at normal weight ");
			System.out.println("you have to do( 1.cut (because high body fat %) , 2. body recomposition ) :- ");
			System.out.println("enter (1/2)");
			int a = san.nextInt();
			san.nextLine();   
			if(a==1)
			{
				return"cut";
			}
			else if(a==2)
			{
				return "body recomposition";
			}
			else {
				System.out.println("please try later please retry the programm");
				return "try again";
			}
		}
		else
		{
			obj1.printline();
			System.out.println("recommand : "+n+" your at over weight ");
			System.out.println("you have do cut (high recommand)(because you are over weight)");
			return "cut";
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		printline();
		printline();
		System.out.println(" WELCOME  TO  THE  GYM  PLANNER (ONE TIME GENERATER)");
		printline();
		printline();
		System.out.println("READ THIS BEFORE GOING TO THE PLANNER");
		System.out.println("**this is for how all are starting stage of fitness ");
		System.out.println("*this not recommand for the advanced gym guy and a bodybuilter");
		System.out.println("*this is one generater planner , if you run again the program, it will start fresh,old data will be new data so please");
		System.out.println("*please enter the data has per the correct spelling and the position and place ment od word based on the question or you get the incorrect data entery ");
		System.out.println("*it has a approximate value all the entery of (calories/bmi/fat perentage)");
		System.out.println("*if you have any error in entery please try again");
		System.out.println("*please the enter the spellings and place of word (you must take it, program did not invoid it)");
		System.out.println("*if you have see any where (try agian) please run the program from starting");
		printline();
		printline();
		System.out.println(" ENTER   THE   DETAIL ");
		System.out.print("Enter The Name :-");
		String n = scan.nextLine();
		System.out.print("Enter The Age :-");
		int a = scan.nextInt();
		System.out.print("Enter The Height (cm) :-");
		double h = scan.nextInt();
		System.out.print("Enter The Weight (kg) :-");
		double w = scan.nextInt();
		System.out.print(" you want workout split (yes / no) or you want only calories :-");
		scan.nextLine();
		String workout = scan.nextLine();
		String g ="";
		boolean l = true;
		while(l)
		{
			System.out.print("your beginner to the gym or not , tell (yes/no) :-");
			g = scan.nextLine();
			if(g.equals("no") || g.equals("yes")|| g.equals("NO") || g.equals("YES"))
			{
				l=false;
			}
		}
		String ac ="";
		l=true;
		while(l)
		{
			System.out.print("Tell your daily activity ( very low ,low , mediam ,high ) :-");
			ac = scan.nextLine();
			if(ac.equals("low") || ac.equals("mediam")|| ac.equals("high") || ac.equals("very low"))
			{
				l=false;
			}
		}
		l=true;
		if(a >15 && a<60)
		{
			detail detail1 = new detail(n,a,h,w,g,ac);
			printline();
			System.out.println("successfully detail are ready");
			printline();
			gymplanner obj1 = new gymplanner();
			double bmi = obj1.bmi(h, w);
			System.out.println("your body mass index value is (refer in google)"+bmi);
			System.out.print("enter you body fat % , please refer the body fat % scale picture from google or other platform :- ");
			double bodyFat = scan.nextDouble();
			printline();
			System.out.println("warning did't belive it compelete because it is a approximately, value so please refer other ");
			String goal =obj1.body_type(scan,n, bodyFat);
			System.out.println("your goal :- "+goal);
			if(workout.equals("yes"))
			{
				obj1.printline();
				System.out.println(" WORKOUT SETTING ");
				obj1.printline();
				System.out.println("note :- ***please copy the workout and paste it on the workout to entery");
				obj1.printline();
				System.out.println("day 1 push day (chest focuesed)");
				obj1.printline();
				work4 chestday1 = new work4("CHEST","Barbell Bench Press (recommand)","Incline Barbell/Dumbbell Press (recommand)","Dips (weighted if possible)","Cable Flys (high to low) (recommand)","Dumbbell Flys (flat or incline)","Pec Deck (recommand)");
				work1 shoulderday1 = new work1("SHOULDER","lateral raises/Partial Lateral Raises (recommand)","Front Raises (dumbbell)/Incline Front Raises");
				work2 tricepday1 = new work2("TRICEPES","Straight Bar Pushdown (recommand)","Overhead Single-Arm Dumbbell Extension (recommand)","Tricep Dips (bench dips, bodyweight)","Reverse-Grip Pushdown (underhand grip, shifts emphasis outward)");
				System.out.println(" day 2 pull day (back focuesed)");
				obj1.printline();
				work4 backday1 = new work4("BACK","Single-Arm Dumbbell Row","Barbell Bent-Over Row (recommand)","Pull-ups (Overhand grip)/Lat Pulldown (recommand)","Straight-Arm Pulldown (cable) (recommand)","Hyperextensions","Chest-Supported Row (machine or incline bench) (recommand)");
				work1 reardeaday1 = new work1("REAR DELTS","Reverse Pec Deck Machine(rd) (recommand)","Dumbbell Reverse Fly (bent-over)(rd)");
				work2 bicepsday1 = new work2("BICEPS","Barbell Curl (recommand)","Close-Grip Chin-ups","Hammer Curl (neutral grip) (recommand)","Incline Dumbbell Curl");
				System.out.println(" day 3 rest ");
				obj1.printline();
				System.out.println(" day 4 push day (shoulder focuesed)");
				obj1.printline();
				work3 shoulderday2 = new work3("SHOULDER","Overhead Press (Barbell)/dumbbell (recommand)","Arnold Press ","Cable Lateral Raises (recommand) ","Front Raises","Rear Delt Flys (bent-over) (recommand)");
				work2 chestday2 = new work2("CHEST","Cable Flys (high to low) (recommand)","Cable Flys (low to high) (recommand)","Dumbbell Flys (flat)","Dumbbell Flys (incline)");
				work2 tricepday2 = new work2("TRICEP","Incline Skull Crushers (bench inclined) (recommand), arms overhead-ish angle)","Single-Arm Cable Pushdown (recommand)","Skull Crushers (flat bench, EZ bar or dumbbell)","Overhead Single-Arm Dumbbell Extension");
				System.out.println(" day 5 pull day (rear detl and biceps focuesed)");
				obj1.printline();
				work3 bicepsday2 = new work3("BICEPS","Preacher Curl (barbell or dumbbell) (recommand)","Concentration Curl","Reverse-Grip Curl (overhand)","Hammer Curl (neutral grip) (recommand)","Incline Dumbbell Curl (recommand)");
				work2 reardeaday2 = new work2("REAR DELTS","Single-Arm Cable Rear Delt Fly (recommand)","Face Pulls (rope, cable) (recommand)","Incline Bench Reverse Fly","Bent-Over Dumbbell Reverse Fly");
				work2 backday2 = new work2("BACK","Pull-ups (Overhand grip)/Lat Pulldown (recommand)","Seated Cable Row (recommand) ","Rack Pulls ","T-Bar Row");
				System.out.println(" day 6 leg day");
				obj1.printline();
				work4  legday = new work4("LEG","Leg Press (recommand)","Romanian Deadlift (RDL) ","Barbell Back Squat (recommand)","Leg Extension (recommand)","Lying/Seated Leg Curl (recommand) ","Cable Kickbacks");
				obj1.printline();
				System.out.println("WORKOUT SPLIT FOR A WEEK");
				obj1.printline();
				System.out.println(" PUSH DAY 1 ( CHEST FOCUSED ) ");
				if(g.equals("no"))
				{
					for(int i =0 ; i<4;i++)
					{
						System.out.println(i+1+". "+(chestday1.workout4[i])+"->"+" set 2 X rep 9-12");
					}
					System.out.println("5. "+shoulderday1.workout1[0]+"->"+" set 2 X rep 9-12");
					for(int i =0;i<2;i++)
					{
						System.out.println(i+6+". "+(tricepday1.workout2[i])+"->"+" set 2 X rep 9-12");
					}
					obj1.printline();
					System.out.println(" PULL DAY 2 (BACK FOCUSED)");
					for(int i=0;i<4;i++)
					{
						System.out.println(i+1+". "+(backday1.workout4[i])+"->"+" set 2 X rep 9-12");
					}
					System.out.println("5. "+reardeaday1.workout1[0]+"->"+" set 2 X rep 9-12");
					for(int i =0;i<2;i++)
					{
						System.out.println(i+6+". "+(bicepsday1.workout2[i])+"->"+" set 2 X rep 9-12");
					}
					obj1.printline();
					System.out.println(" REST DAY 3");
					obj1.printline();
					System.out.println(" PUSH(2) DAY 4 ( SHOULDER FOCUSED )");
					for(int i=0;i<3;i++)
					{
						System.out.println(i+1+". "+(shoulderday2.workout3[i])+"->"+" set 2 X rep 9-12");
					}
					for(int i =0;i<2;i++)
					{
						System.out.println(i+4+". "+(chestday2.workout2[i])+"->"+" set 2 X rep 9-12");
					}
					for(int i =0;i<2;i++)
					{
						System.out.println(i+6+". "+(tricepday2.workout2[i])+"->"+" set 2 X rep 9-12");
					}
					obj1.printline();
					System.out.println(" PULL(2) DAY 5 ( REAR DEALT AND BICEPS)");
					for(int i=0;i<3;i++)
					{
						System.out.println(i+1+". "+(bicepsday2.workout3[i])+"->"+" set 2 X rep 9-12");
					}
					for(int i =0;i<2;i++)
					{
						System.out.println(i+4+". "+(reardeaday2.workout2[i])+"->"+" set 2 X rep 9-12");
					}
					for(int i =0;i<2;i++)
					{
						System.out.println(i+6+". "+(backday2.workout2[i])+"->"+" set 2 X rep 9-12");
					}
					obj1.printline();
					System.out.println(" LEG DAY 6 ");
					for(int i=0;i<4;i++)
					{
						System.out.println(i+1+". "+(legday.workout4[i])+"->"+" set 2 X rep 9-12");
					}
					obj1.printline();
					System.out.println("* this is the weekly workout plan");
				}
				else if(g.equals("yes"))
				{
					for(int i =0 ; i<4;i++)
					{
						System.out.println(i+1+". "+(chestday1.workout4[i])+"->"+" set 3 X rep 12-15");
					}
					System.out.println("5. "+shoulderday1.workout1[0]+"->"+" set 3 X rep 12-15");
					for(int i =0;i<2;i++)
					{
						System.out.println(i+6+". "+(tricepday1.workout2[i])+"->"+" set 3 X rep 12-15");
					}
					obj1.printline();
					System.out.println(" PULL DAY 2 (BACK FOCUSED)");
					for(int i=0;i<4;i++)
					{
						System.out.println(i+1+". "+(backday1.workout4[i])+"->"+" set 3 X rep 12-15");
					}
					System.out.println("5. "+reardeaday1.workout1[0]+"->"+" set 3 X rep 12-15");
					for(int i =0;i<2;i++)
					{
						System.out.println(i+6+". "+(bicepsday1.workout2[i])+"->"+" set 3 X rep 12-15");
					}
					obj1.printline();
					System.out.println(" REST DAY 3");
					obj1.printline();
					System.out.println(" PUSH(2) DAY 4 ( SHOULDER FOCUSED )");
					for(int i=0;i<3;i++)
					{
						System.out.println(i+1+". "+(shoulderday2.workout3[i])+"->"+" set 3 X rep 12-15");
					}
					for(int i =0;i<2;i++)
					{
						System.out.println(i+4+". "+(chestday2.workout2[i])+"->"+" set 3 X rep 12-15");
					}
					for(int i =0;i<2;i++)
					{
						System.out.println(i+6+". "+(tricepday2.workout2[i])+"->"+" set 3 X rep 12-15");
					}
					obj1.printline();
					System.out.println(" PULL(2) DAY 5 ( REAR DEALT AND BICEPS)");
					for(int i=0;i<3;i++)
					{
						System.out.println(i+1+". "+(bicepsday2.workout3[i])+"->"+" set 3 X rep 12-15");
					}
					for(int i =0;i<2;i++)
					{
						System.out.println(i+4+". "+(reardeaday2.workout2[i])+"->"+" set 3 X rep 12-15");
					}
					for(int i =0;i<2;i++)
					{
						System.out.println(i+6+". "+(backday2.workout2[i])+"->"+" set 3 X rep 12-15");
					}
					obj1.printline();
					System.out.println(" LEG DAY 6 ");
					for(int i=0;i<4;i++)
					{
						System.out.println(i+1+". "+(legday.workout4[i])+"->"+" set 3 X rep 12-15");
					}
					obj1.printline();
					System.out.println("* this is the weekly workout plan and a screenshot/note down (one time generater)");
				}
			}
			obj1.printline();
			System.out.println("MAINTENANCE calories LEVEL");
			obj1.printline();
			double CAL = 1.55*((10*w)+(6.25*h)-(5*a) + 5);
			System.out.println("this your maintenance calories");
			System.out.println(CAL);
			obj1.printline();
			System.out.println("note :- this will every time it change per week based on weight, more weight so add some calories or less weight reduce the calories ru");
			obj1.printline();
			System.out.println("this is the intake per week based on the goal");
			if(goal.equals("cut"))
			{
				CAL =CAL-400;
				System.out.println(goal+" :- "+(CAL));
				double Protein = w*1.8;
				double fats = w*0.8;
				double cards = (CAL-(Protein*4)-(fats*9))/4;
				System.out.println("per day protein goal :- "+Protein);
				System.out.println("per day fats goal :- "+fats);
				System.out.println("per day cards goal :- "+cards);
			}
			else if(goal.equals("body recomposition"))
			{
				System.out.println(goal+" :- "+(CAL));
				double Protein = w*1.8;
				double fats = w*0.8;
				double cards = (CAL-(Protein*4)-(fats*9))/4;
				System.out.println("per day protein goal :- "+Protein);
				System.out.println("per day fats goal :- "+fats);
				System.out.println("per day cards goal :- "+cards);
			}
			else if(goal.equals("bulk"))
			{
				CAL = CAL+400;
				System.out.println(goal+" :- "+(CAL));
				double Protein = w*1.8;
				double fats = w*0.8;
				double cards = (CAL-(Protein*4)-(fats*9))/4;
				System.out.println("per day protein goal :- "+Protein);
				System.out.println("per day fats goal :- "+fats);
				System.out.println("per day cards goal :- "+cards);
			}
			else {
				System.out.println("please try later please retry the programm");
			}
			obj1.printline();
			System.out.println("BASED ON THE CALORIES INTAKE ");
			System.out.println(n+" PLEASE HIT THIS EVERY DAY ");
			if(ac.equals("very low"))
			{
				System.out.println("after the gym workout based on very low activity  ");
				System.out.println("12,000 steps");
			}
			else if(ac.equals("low"))
			{
				System.out.println("after the gym workout based on low activity  ");
				System.out.println("10,000 steps");
			}
			else if(ac.equals("mediam"))
			{
				System.out.println("after the gym workout based on low activity  ");
				System.out.println("9,000 steps");

			}
			else if(ac.equals("high"))
			{
				System.out.println("after the gym workout based on low activity  ");
				System.out.println("8,000 steps");
			}
			obj1.printline();
			System.out.println("SLEEP 7-8 HOUR");
			obj1.printline();
			System.out.println("thank you for trying this planner");
			obj1.printline();
		}
		else if(a<15)
		{
			printline();
			System.out.println("Not appropriate for structured gym planning — reject this input, since BMR/calorie formulas (Mifflin-St Jeor) aren't validated for children and gym programming isn't typically designed for this age");
			System.out.println("please try later , thank you");
			printline();
		}
		else {
			printline();
			System.out.println("recommending medical clearance (matches what we discussed for seniors)");
			System.out.println("please try later , thank you");
			printline();
		}
		
	}
	
}


