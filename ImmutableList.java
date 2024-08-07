/*
Jacob Wahlers
CSC 422 - Software Engineering
Assignment 4 - Adapter Class
*/

//importing java packages
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

//call back from other class
//setting up arraylist
public class ImmutableList implements IImmutableList {
    public ArrayList < Integer > List() 
    {
      return list;
    }
   private ArrayList < Integer > List = new ArrayList < Integer >     
  ();
   public void setList(ArrayList < Integer > list) 
    {
      this.list = list;
   }

   private ArrayList < Integer > list;
   public ImmutableList(int[] nums) 
    {
      list = new ArrayList < Integer > ();
      for (int h = 0; h < nums.length; h++) list.add(nums[h]);
   }
    
    public ImmutableList(IImmutableList list2) {
      list = new ArrayList < Integer > ();
      for (int h = 0; h < list2.size(); h++) {
         list.add(list2.get(h));
      }
  }

  //overriding because of superclass
  //returning elements in the list
  @Override
      public int size() {
        return list.size();
      }
   @Override
   public int get(int index) {
      return list.get(index);
   }
  @Override
     public String toString() {
        return list.toString();
     }
  
  //concat appends the first string to the second string and returns the combined string
   @Override
   public IImmutableList concat(IImmutableList list2) {
      ArrayList < Integer > list3 = new ArrayList < Integer > ();
      int[] nums = new int[list.size() + list2.size()];
      int h = 0;
      for (int g = 0; g < list.size(); g++)
      for (h = 0; h < size(); h++) {
         nums[h] = list.get(g);
         nums[h] = list.get(h);
      }

      for (int g = 0; g < list2.size(); g++, h++)
         nums[h] = list2.get(g);

      return new ImmutableList(nums);
   }
}
