package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Taxi.class)
public abstract class Taxi_ extends pojo.Veiculo_ {

	public static volatile SingularAttribute<Taxi, String> concessionario;
	public static volatile SingularAttribute<Taxi, Integer> concessao;
	public static volatile ListAttribute<Taxi, Auxiliar> auxiliar;
	public static volatile SingularAttribute<Taxi, Integer> alvara;
	public static volatile SingularAttribute<Taxi, Long> cic;

}

