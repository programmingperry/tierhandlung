package Tierhandlung;

public interface TierListenInterface {

    public String getTier(String name);

    public int getTier(int index);

    public void add(Tier tierNeu);

    public boolean delete(int index);

    public boolean delete(String name);

    public void sort();

    public void count();

}