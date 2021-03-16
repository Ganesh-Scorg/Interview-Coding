
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PendingTransaction {
	public PendingTransaction(long d) {
		this.id = d;
	}

	private long id;

	long getId() {
		return id;
	}
}

class ProcessedTransaction {
	private String id;
	private Optional<String> status;

	public ProcessedTransaction(String i, Optional<String> status) {
		this.id = i;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public Optional<String> getStatus() {

		return status;
	}
}

public class DeepakStr {

	static Stream<PendingTransaction> reconcile1(Stream<PendingTransaction> pending,
			Stream<Stream<ProcessedTransaction>> processed) {

		if (pending == null || processed == null)
			return Stream.empty();

		Stream<ProcessedTransaction> filteredProcessedId = processed.filter(pstr -> pstr != null) // each
																									// stream
																									// should
																									// not
																									// be
																									// null
				.flatMap(p -> p) // getting each element from here
				.filter(p -> p != null) // each element should not be null
				.filter(p -> p.getId() != null) // id should not be null
				.filter(p -> p.getId() != "") // id should not be empty
				.filter(p -> p.getStatus() != null) /////////////////////////// change
				.filter(p -> p.getStatus().isPresent()).filter(p -> "DONE".equalsIgnoreCase(p.getStatus().get()));

		// pending.filter(p -> p.getId() );

		ArrayList<PendingTransaction> penList2 = new ArrayList<PendingTransaction>();
		penList2 = (ArrayList<PendingTransaction>) pending.collect(Collectors.toList());
		ArrayList<ProcessedTransaction> proList2 = new ArrayList<ProcessedTransaction>();
		proList2 = (ArrayList<ProcessedTransaction>) filteredProcessedId.collect(Collectors.toList());

		ArrayList<PendingTransaction> penList3 = new ArrayList<PendingTransaction>();

		for (ProcessedTransaction pro : proList2) {
			for (PendingTransaction pen : penList2)
				if (pen.getId() == Long.parseLong(pro.getId()))
					penList3.add(pen);
		}

		return penList3.stream();
	}

	public static void main(String[] args) {
		PendingTransaction pn1 = new PendingTransaction(1);
		PendingTransaction pn2 = new PendingTransaction(2);
		PendingTransaction pn3 = new PendingTransaction(3);
		PendingTransaction pn4 = new PendingTransaction(4);
		PendingTransaction pn5 = new PendingTransaction(5);
		List penList = new ArrayList<PendingTransaction>();
		penList.add(pn1);
		penList.add(pn2);
		penList.add(pn3);
		penList.add(pn4);
		penList.add(pn5);

		ProcessedTransaction pr1 = new ProcessedTransaction("1", Optional.ofNullable("Done"));
		ProcessedTransaction pr2 = new ProcessedTransaction("2", Optional.ofNullable("Done"));
		ProcessedTransaction pr3 = new ProcessedTransaction(null, Optional.ofNullable("Done"));
		ProcessedTransaction pr4 = new ProcessedTransaction("4", null);
		ProcessedTransaction pr5 = new ProcessedTransaction("5", Optional.ofNullable("Done"));
		List proList1 = new ArrayList<ProcessedTransaction>();
		proList1.add(pr1);
		proList1.add(pr2);
		List proList2 = new ArrayList<ProcessedTransaction>();
		proList1.add(pr3);
		proList1.add(pr5);
		proList1.add(pr4);

		Stream<Stream<ProcessedTransaction>> processed123 = Stream.of(proList1.stream(), proList2.stream());

		Stream<PendingTransaction> result = reconcile1(penList.stream(), processed123);

		// System.out.println(result.collect(Collectors.toList()));
		result.forEach(x -> System.out.println(x.getId()));

	}

	static Stream<PendingTransaction> reconcile11(Stream<PendingTransaction> pending,
			Stream<Stream<ProcessedTransaction>> processed) {

		if (pending == null || processed == null)
			return Stream.empty();

		Stream<Long> filterprocessd = processed.flatMap(p -> p).filter(p -> p != null)
				.filter(p -> p.getStatus() != null && "DONE".equalsIgnoreCase(p.getStatus().get()))
				.filter(p -> p.getId() != null && p.getId().length() > 0).map(p -> Long.parseLong(p.getId()));

		// filterprocessd.forEach(s->System.out.println(s));

		System.out.println("Deepak Patil");

		// pending.forEach(p->System.out.print(p.getId()));

		return pending.filter(p -> filterprocessd.anyMatch(pr -> pr.equals(p.getId())));

	}

	static Stream<PendingTransaction> reconcile(Stream<PendingTransaction> pending,
			Stream<Stream<ProcessedTransaction>> processed) {

		if (pending == null || processed == null)
			return Stream.empty();

		Stream<ProcessedTransaction> filteredProcessed = processed.filter(pstr -> pstr != null) // each
																								// stream
																								// should
																								// not
																								// be
																								// null
				.flatMap(p -> p) // getting each element from here
				.filter(p -> p != null) // each element should not be null
				.filter(p -> p.getId() != null) // id should not be null
				.filter(p -> p.getId() != "") // id should not be empty
				.filter(p -> p.getStatus() != null) /////////////////////////// change
				.filter(p -> p.getStatus().isPresent()).filter(p -> "DONE".equalsIgnoreCase(p.getStatus().get()));

		Set<String> set = filteredProcessed.map(x -> x.getId()).collect(Collectors.toSet());

		/*
		 * Map<String, ProcessedTransaction> processedTransactionMap =
		 * filteredProcessed
		 * .collect(Collectors.toMap(ProcessedTransaction::getId, x->x));
		 */
		// return pending.filter(p ->
		// processedTransactionMap.containsKey(String.valueOf(p.getId())));
		return pending.filter(p -> set.contains(String.valueOf(p.getId())));

	}
}
