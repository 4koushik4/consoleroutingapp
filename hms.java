
import java.util.ArrayList;
import java.util.Scanner;

class services {

  ArrayList<String> a = new ArrayList<>();

  int curr_index = -1;

  public void search1(String name) {

    a.add(name);

    System.out.println("You are on the page " + name);

    curr_index += 1;

  }

  public String prev() {

    if (curr_index==-1){ return "you can't go back you are on the home page"; }

    else if (curr_index > 0) {

      curr_index--;

      return a.get(curr_index);

    }

    return "there is no previous page";

  }

  public String next() {

    if (curr_index < a.size() - 1) {

      curr_index++;

      return a.get(curr_index);

    }

    return "there is no nextPage";

  }

  public String home() {

    curr_index = 0;

    return "Landed to home page";

  }

}

class hms {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    services bh = new services();

    while (true) {

      System.out.println("-----------------------------------------------");

      System.out.println("press 1.search");

      System.out.println("press 2.previous_page");

      System.out.println("press 3.next_page");

      System.out.println("press 4.Home_page");

      System.out.println("press 5.Clear_page");

      System.out.println("press any to exit");

      System.out.println("-----------------------------------------------");

      String press = sc.nextLine();

      if (!press.equals("1") && !press.equals("2") && !press.equals("3") && !press.equals("4")&&!press.equals("5")) {

        System.out.println("You are exited from web page");

        break;

      } else if (press.equals("1")) {

        System.out.println("Enter the link you want to seacrh");

        String search = sc.nextLine().toLowerCase();

        bh.search1(search);

      } else if (press.equals("2")) {

        System.out.println("the previous page is:" + bh.prev());

      } else if (press.equals("3")) {

        System.out.println("The next page is:" + bh.next());

      } else if (press.equals("4")) {

        System.out.println(bh.home());

      }

    }

  }

}



































































