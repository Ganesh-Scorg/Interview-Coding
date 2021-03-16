import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TransactionReconciler {
 
	private static final String DONE = "DONE";

	static Stream<PendingTransaction1> reconcile3(Stream<PendingTransaction1> pending,
			Stream<Stream<ProcessedTransaction1>> processed) {

		if (pending == null || processed == null || pending.count() == 0 || processed.count() == 0) {
			return Stream.empty();
		}
		
		Supplier<Stream<PendingTransaction1>> pendings =() -> pending;
		
		Supplier<Stream<ProcessedTransaction1>> validTransactions = () -> processed.flatMap(Function.identity())
				.filter(p -> p.getId() != null && p.getStatus() != null);

		return pendings.get().filter(ele -> validTransactions.get()
				.anyMatch(p -> Long.valueOf(p.getId()) == ele.getId() && p.getStatus().get() == DONE));

	}
	
	
	public static void main(String[] args) {
		PendingTransaction1 pn1 = new PendingTransaction1(1);
		PendingTransaction1 pn2 = new PendingTransaction1(2);
		PendingTransaction1 pn3 = new PendingTransaction1(3);
		PendingTransaction1 pn4 = new PendingTransaction1(4);
		PendingTransaction1 pn5 = new PendingTransaction1(5);
		List penList = new ArrayList<PendingTransaction1>();
		penList.add(pn1);
		penList.add(pn2);
		penList.add(pn3);
		penList.add(pn4);
		penList.add(pn5);

		ProcessedTransaction1 pr1 = new ProcessedTransaction1("1", Optional.ofNullable("Done"));
		ProcessedTransaction1 pr2 = new ProcessedTransaction1("2", Optional.ofNullable("Done"));
		ProcessedTransaction1 pr3 = new ProcessedTransaction1(null, Optional.ofNullable("Done"));
		ProcessedTransaction1 pr4 = new ProcessedTransaction1("4", null);
		ProcessedTransaction1 pr5 = new ProcessedTransaction1("5", Optional.ofNullable("Done"));
		List proList1 = new ArrayList<ProcessedTransaction1>();
		proList1.add(pr1);
		proList1.add(pr2);
		List proList2 = new ArrayList<ProcessedTransaction1>();
		proList1.add(pr3);
		proList1.add(pr5);
		proList1.add(pr4);

		Stream<Stream<ProcessedTransaction1>> processed123 = Stream.of(proList1.stream(), proList2.stream());

		Stream<PendingTransaction> result = reconcile3(penList.stream(), processed123);

		//System.out.println(result.collect(Collectors.toList()));
		//result.forEach(x -> System.out.println(x.getId()));

	}


}

  class PendingTransaction1 {

	public long id;

	public PendingTransaction1(int i) {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
}
  

  class ProcessedTransaction1 {
	// can be null or empty numeric value
	public String id;

	// can be null
	public Optional<String> status;

	public ProcessedTransaction1(String string, Optional<String> ofNullable) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {

		return id;
	}

	public Optional<String> getStatus() {

		return status;
	}
}