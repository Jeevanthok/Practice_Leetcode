package com.Stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TransactionFilter {
    // Sample Transaction class
    static class Transaction {
        private String id;
        private String type;
        private double amount;

        public Transaction(String id, String type, double amount) {
            this.id = id;
            this.type = type;
            this.amount = amount;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "id='" + id + '\'' +
                    ", type='" + type + '\'' +
                    ", amount=" + amount +
                    '}';
        }

    }

    public static void main(String[] args) {
        // Example list of transactions
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", "DEPOSIT", 1000.0),

                new Transaction("T2", "WITHDRAWAL", 500.0),
                new Transaction("T3", "DEPOSIT", 1500.0),
                new Transaction("T4", "TRANSFER", 200.0),
                new Transaction("T5", "WITHDRAWAL", 700.0)
        );

        // Specify the transaction type to filter by
        String transactionTypeToFilter = "WITHDRAWAL";

        // Filter transactions by the specified type and collect them into a Set
        Set<Transaction> filteredTransactions = transactions.stream()
                .filter(transaction -> transaction.getType().equals(transactionTypeToFilter))
                .collect(Collectors.toSet());

        // Print the filtered transactions
        filteredTransactions.forEach(System.out::println);

        Map<String, List<Transaction>> groupedTransactions = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getType));

        for(Map.Entry<String,List<Transaction>> map2 :groupedTransactions.entrySet()){
            System.out.println("----------------------" +map2.getKey() + " " + map2.getValue());
        }

        groupedTransactions.forEach((type, transactionList) -> {
            System.out.println("Transaction Type: " + type);
            transactionList.forEach(System.out::println);
            System.out.println();
        });
    }
}

