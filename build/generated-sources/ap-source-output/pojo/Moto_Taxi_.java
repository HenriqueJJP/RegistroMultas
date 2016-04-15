package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Moto_Taxi.class)
public abstract class Moto_Taxi_ extends pojo.Veiculo_ {

	public static volatile SingularAttribute<Moto_Taxi, String> concessionario;
	public static volatile SingularAttribute<Moto_Taxi, Integer> concessao;
	public static volatile SingularAttribute<Moto_Taxi, Auxiliar> auxiliar;
	public static volatile SingularAttribute<Moto_Taxi, Integer> alvara;
	public static volatile SingularAttribute<Moto_Taxi, Long> cic;

}

