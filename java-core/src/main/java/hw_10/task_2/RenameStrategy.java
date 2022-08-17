package hw_10.task_2;

// +
// да, можно через интерфейс заставить переопределить все методы. есть еще вариант добавить абстрактный метод в RenameStrategy
public enum RenameStrategy implements Renamable {
    LOWERCASE {
        @Override
        public String name(String s) {
            return s.toLowerCase();
        }
    },
    CAPITALIZED {
        @Override
        public String name(String s) {
            return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        }
    },
    UPEERCASE {
        @Override
        public String name(String s) {
            return s.toUpperCase();
        }
    };


}
