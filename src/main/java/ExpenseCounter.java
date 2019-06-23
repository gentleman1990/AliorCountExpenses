import model.ExpenseModel;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ExpenseCounter {
    private List<ExpenseModel> models;
    private HashMap<String, String> tags;

    public ExpenseCounter(List<ExpenseModel> models, HashMap<String, String> tags) {
        this.models = models;
        this.tags = tags;
    }

    public void print() {
        models.forEach(model -> System.out.println(model.getTag() + ": " + model.getValue()));
            tags.forEach((key, value) -> {
            double sum = models.stream().filter(model -> Optional.ofNullable(model.getTag()).orElse("").equals(value)).mapToDouble(ExpenseModel::getValue).sum();
            System.out.println(value.toUpperCase() + ": " + sum);
        });
        System.out.println("RESZTA: " + models.stream().filter(model -> model.getTag() == null).mapToDouble(model -> model.getValue()).sum());
    }

    public void tag() {
        models.forEach(model -> {
            tags.forEach((key, value) -> {
                if (model.getDescription().toLowerCase().contains(key) || model.getReceiver().toLowerCase().contains(key)) {
                    model.setTag(value);
                }
            });
        });
        //models.stream().filter(model -> model.getTag() == null).forEach(model -> model.setTag(model.getDescription()));
    }
}
