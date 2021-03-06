package Graphtheory.DijkstraShortestReach;

//package Graphtheory.BFSShortestReach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int T = Integer.parseInt(br.readLine());
		    while(T-->0){
		    	String str[] = br.readLine().split(" ");
		    	int N=Integer.parseInt(str[0]);
		    	int M=Integer.parseInt(str[1]);
		    	int graph[][]= new int[N+1][N+1];
              for(int i=0;i<=N;i++)
              	for(int j=0;j<=N;j++)
              		if(i==j)
              			graph[i][j]=0;
              		else
              		graph[i][j]=-1;
		    	for(int i=0;i<M;i++)
		    	{
		    		str = br.readLine().split(" ");
		    		int p=Integer.parseInt(str[0]);
		    		int q=Integer.parseInt(str[1]);
		    		int w= Integer.parseInt(str[2]);
		    		if(w<graph[p][q]||graph[p][q]==-1)
		    		graph[p][q]=graph[q][p]=w;
		    		
		    	}
		    	int s = Integer.parseInt(br.readLine());

		    	
		    	    for(int l=1;l<=11;l++)
		 		   // for(int i=1;i<=N;i++)
		 			   for(int j=1;j<=N;j++)
		 				  for(int k=1;k<=N;k++)
		 				   if(graph[s][k]!=-1&&graph[k][j]!=-1)
		 				   if(graph[s][j]>graph[s][k]+graph[k][j]||graph[s][j]==-1)
		 					   graph[s][j]=graph[s][k]+graph[k][j];

             
		   for(int j=1;j<=N;j++)
			   if(j!=s)
			   System.out.print(graph[s][j]+" ");
		   System.out.println("");
		    }

	}

}
