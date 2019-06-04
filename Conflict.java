List<Integer> numlist= new LinkedList<Integer>();
for(int i=0;i<100;i++)numlist.add(i+1);
//こっから乱数生成
Random rand=new Random();
int kekka[]=new int[10];
for(int i=0;i<10;i++){
int index=rand.nextInt(numlist.size());
kekka[i]=numlist.remove(index);
}
for(int i:kekka){
System.out.println(i);
}
