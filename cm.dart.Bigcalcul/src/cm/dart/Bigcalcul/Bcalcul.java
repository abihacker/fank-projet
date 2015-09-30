package cm.dart.Bigcalcul;

import java.math.BigDecimal;

public class Bcalcul {
	private static final long INFLATED = 0;
	private long valor1;
	private long valor2;



	public long getValor1() {
		return valor1;
	}



	public void setValor1(long valor1) {
		this.valor1 = valor1;
	}



	public long getValor2() {
		return valor2;
	}



	public void setValor2(long valor2) {
		this.valor2 = valor2;
	}



	public Bcalcul(){
		this.valor1 = valor1;
		this.valor2 = valor2;
	}


	}

		public BigDecimal add(BigDecimal valor1,BigDecimal valor2) {
			if (this.valor1 != INFLATED) {
				if ((valor1.ROUND_CEILING != INFLATED)) {
					return  valor1.add(valor2);
				} 
			}
			  public BigDecimal subtract(BigDecimal valor1,BigDecimal valor2) {
			        if (this.valor1 != INFLATED) {
			            if ((valor2.ROUND_CEILING != INFLATED)) {
			                return add(this.intCompact, this.scale, -subtrahend.intCompact, subtrahend.scale);
			            } else {
			                return add(this.intCompact, this.scale, subtrahend.intVal.negate(), subtrahend.scale);
			            }
			        } else {
			            if ((subtrahend.intCompact != INFLATED)) {
			                // Pair of subtrahend values given before pair of
			                // values from this BigDecimal to avoid need for
			                // method overloading on the specialized add method
			                return add(-subtrahend.intCompact, subtrahend.scale, this.intVal, this.scale);
			            } else {
			                return add(this.intVal, this.scale, subtrahend.intVal.negate(), subtrahend.scale);
			            }
			        }
			    }
		}


