public interface IImmutableList 
{
  public int get(int index);
  
  public IImmutableList  concat(IImmutableList list);
  
  public int size();
  
  @Override
  public String toString();
}
