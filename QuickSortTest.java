public class QuickSortTest{
	public static void main(String[] args){
		int [] data = {3,7,2,1,8,10};
		QuickSort a = new QuickSort(data);
		a.quickSort(0,data.length-1);
		for(int i : data){
			System.out.println(i);
		}
	}
}

class QuickSort{
	private int[] data;

	QuickSort(int[] A){
		data = A;
	}

	public int Partition(int left, int right){
		int temp = data[left];
		while(left < right){
			if(left < right){
				for(;data[right] > temp;right--);
				data[left] = data[right];
				left++;
			}
			if(left < right){
				for(;data[left] <= temp;left++);
				data[right] = data[left];
				right--;
			}
		}
		if(data[left] == data[right])
			data[left] = temp;
		return left;
	}
	public void quickSort(int left, int right){
		if(left < right){
			int pos = Partition(left, right);
			quickSort(left, pos-1);
			quickSort(pos+1, right);
		}
	}
}
