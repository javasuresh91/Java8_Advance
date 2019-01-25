package com.lambda.best.practise.self.explanatory;

import java.util.function.Function;

public class FinalVariable {

	public static void main(String[] args) {

		String variable = "Hai";
		Function<String, String> finalVaraccess = str -> {
			//This cannot be compile 
//			variable = "Suesh "+str;
			return "Suesh "+str;
		};

	}

}
