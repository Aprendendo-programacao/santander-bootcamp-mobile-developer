# TextView, RadioButton e CheckBox

### TextView

* **`sp`**

  * Unidade de medida exclusiva para texto

  * Respeita as dimensões de acessibilidade

* **Exemplo**

  ```xml
  <TextView
        android:id="@+id/textView"
        style="@style/title_purple"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
  ```

### RadioButton

* **Exemplo**

  ```xml
  <RadioButton
        android:id="@+id/radioButton"
        style="@style/title_purple"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Olá radio button"
        android:textSize="22sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.042" />
  ``` 

### CheckBox

* **Exemplo**

  ```xml
  <CheckBox
        style="@style/title_purple"
        android:textColor="@color/black"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Olá checkbox"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioButton"
        app:layout_constraintVertical_bias="0.207" />
  ``` 

### styles.xml

* Armazena estilos de Views que podem ser reutilizadas em outras Views

* Importar um estilo do `styles.xml` em uma view, utiliza-se o atributo `style`: `style="@style/<nome do estilo>"`

* Ao alterar um estilo no `styles.xml`, refletirá em todos as View que importam esse estilo 

* **Exemplo**

  ```xml
  <?xml version="1.0" encoding="utf-8"?>
  <resources>

      <style name="title_purple">
          <item name="android:textColor">@android:color/holo_blue_bright</item>
          <item name="android:textSize">48sp</item>
          <item name="android:textStyle">bold</item>
      </style>
  </resources>
  ```