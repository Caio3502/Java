package br.fadep.exercicio;


public class Palindromo {
		private int n = 10;
		private char[] pilha = new char[n];
		private int tamanho;

		void empilha(char y) {
			pilha[tamanho++] = y;
		}

		boolean pilhavazia() {
			return tamanho <= 0;
		}

		String inverterString(String texto) {
			String strInverse = "";
			for (int i = texto.length() - 1; i >= 0; i--) {
				strInverse += texto.charAt(i);
			}
			return strInverse;
		}

		public String toString() {
			if (this.pilhavazia()) {
				return "[]";
			}
			StringBuilder builder = new StringBuilder("");

			for (int i = 0; i < this.tamanho - 1; i++) {
				builder.append(this.pilha[i]);
			}

			builder.append(this.pilha[this.tamanho - 1]);
			return builder.toString();
		}
	}


