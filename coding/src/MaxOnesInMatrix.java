
public class MaxOnesInMatrix {
	public static void main(String args[]){
		int matrixArray[][]={{0,0},{1,0}, {1,1}};
		int rowWithMaxOnes = maxOnes(matrixArray);
		System.out.println(rowWithMaxOnes);
		
	}

	private static int maxOnes(int[][] matrixArray) {
		// TODO Auto-generated method stub
		int rows = matrixArray.length;
		int columns = matrixArray[0].length;
		int colIndex =0;
		int maxOnes=0;
		int maxOnesRow=-1;
		for (int rowCount=0; rowCount<rows; rowCount++)
		{
			if(matrixArray[rowCount][colIndex]!=1){
				continue;
			}
			while(colIndex<columns && matrixArray[rowCount][colIndex] ==1 ){
				colIndex++;
			}
			if(colIndex > maxOnes){
				maxOnes = colIndex;
				maxOnesRow = rowCount;
			}
		}
		
		return maxOnesRow;
	}

}
