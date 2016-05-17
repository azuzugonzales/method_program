package by.bsu.collection.itemgeneric;


import java.util.LinkedList;
import java.util.Queue;

public class OrderQueueAction {

	public static void main(String[] args) {
		LinkedList<Order> orders = new LinkedList<Order>() {
			{
				add(new Order(231, 12.1f));
				add(new Order(389, 2.91f));
				add(new Order(217, 1.72f));
			}
		};
		Queue<Order> queueA = orders;
		queueA.offer(new Order(222, 9.72f));
		orderProcessing(queueA);
		if (queueA.isEmpty()) {
			System.out.println("Queue of Orders is empty");
		}
	}

	public static void orderProcessing(Queue<Order> queue) {    // change void -> boolean
		Order ob = null;
		// change while -> do{} while

		do {
			//System.out.println(ob);

		} while ((ob = queue.poll()) != null);
		System.out.println("Order #" + ob.getOrderId() + " is processing");
		// verifying and processing
	}

}


	/*public static void orderProcessing(Queue<Order> queue){	// change void -> boolean
		Order ob = null;
		// change while -> do{} while
		while((ob = queue.poll()) != null){
			System.out.println("Order #" + ob.getOrderId() + " is processing");
			// verifying and processing
		}
	}*/

