import java.util.List;

import SuperBuilderBasicToBuilder.Child;
import SuperBuilderBasicToBuilder.Parent;
import SuperBuilderBasicToBuilder.Child.ChildBuilder;
import SuperBuilderBasicToBuilder.Child.ChildBuilderImpl;
import SuperBuilderBasicToBuilder.Parent.ParentBuilder;
public class SuperBuilderWithGenericsAndToBuilder {
  public static @lombok.experimental.SuperBuilder class Parent<A> {
    public static abstract @java.lang.SuppressWarnings("all") class ParentBuilder<A, C extends Parent<A>, B extends ParentBuilder<A, C, B>> {
      private @java.lang.SuppressWarnings("all") A field1;
      private @java.lang.SuppressWarnings("all") java.util.ArrayList<String> items;
      public ParentBuilder() {
        super();
      }
      protected @java.lang.SuppressWarnings("all") B $fillValuesFrom(final C instance) {
          ParentBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
          return self();
        }
      private static @java.lang.SuppressWarnings("all") void <A>$fillValuesFromInstanceIntoBuilder(final Parent<A> instance, final ParentBuilder<A, ?, ?> b) {
        b.field1(instance.field1);
        b.items(((instance.items == null) ? java.util.Collections.emptyList() : instance.items));
      }
      protected abstract @java.lang.SuppressWarnings("all") B self();
      public abstract @java.lang.SuppressWarnings("all") C build();
      public @java.lang.SuppressWarnings("all") B field1(final A field1) {
        this.field1 = field1;
        return self();
      }
      public @java.lang.SuppressWarnings("all") B item(String item) {
        if ((this.items == null))
            this.items = new java.util.ArrayList<String>();
        this.items.add(item);
        return self();
      }
      public @java.lang.SuppressWarnings("all") B items(java.util.Collection<? extends String> items) {
        if ((this.items == null))
            this.items = new java.util.ArrayList<String>();
        this.items.addAll(items);
        return self();
      }
      public @java.lang.SuppressWarnings("all") B clearItems() {
        if ((this.items != null))
            this.items.clear();
        return self();
      }
      public @java.lang.Override @java.lang.SuppressWarnings("all") java.lang.String toString() {
        return (((("SuperBuilderWithGenericsAndToBuilder.Parent.ParentBuilder(field1=" + this.field1) + ", items=") + this.items) + ")");
      }
    }
    private static final @java.lang.SuppressWarnings("all") class ParentBuilderImpl<A> extends ParentBuilder<A, Parent<A>, ParentBuilderImpl<A>> {
      private ParentBuilderImpl() {
        super();
      }
      protected @java.lang.Override @java.lang.SuppressWarnings("all") ParentBuilderImpl<A> self() {
        return this;
      }
      public @java.lang.Override @java.lang.SuppressWarnings("all") Parent<A> build() {
        return new Parent<A>(this);
      }
    }
    A field1;
    @lombok.Singular List<String> items;
    protected @java.lang.SuppressWarnings("all") Parent(final ParentBuilder<A, ?, ?> b) {
      super();
      this.field1 = b.field1;
      java.util.List<String> items;
      switch (((b.items == null) ? 0 : b.items.size())) {
      case 0 : 
          items = java.util.Collections.emptyList();
          break;
      case 1 : 
          items = java.util.Collections.singletonList(b.items.get(0));
          break;
      default : 
          items = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(b.items));
      }
      this.items = items;
    }
    public @java.lang.SuppressWarnings("all") <A>ParentBuilder<A, ?, ?> toBuilder() {
      return new ParentBuilderImpl<A>().$fillValuesFrom(this);
    }
    public static @java.lang.SuppressWarnings("all") <A>ParentBuilder<A, ?, ?> builder() {
      return new ParentBuilderImpl<A>();
    }
  }
  public static @lombok.experimental.SuperBuilder class Child<A> extends Parent<A> {
    public static abstract @java.lang.SuppressWarnings("all") class ChildBuilder<A, C extends Child<A>, B extends ChildBuilder<A, C, B>> extends Parent.ParentBuilder<A, C, B> {
      private @java.lang.SuppressWarnings("all") double field3;
      public ChildBuilder() {
        super();
      }
      protected @java.lang.Override @java.lang.SuppressWarnings("all") B $fillValuesFrom(final C instance) {
        super.$fillValuesFrom(instance);
        ChildBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
        return self();
      }
      private static @java.lang.SuppressWarnings("all") void <A>$fillValuesFromInstanceIntoBuilder(final Child<A> instance, final ChildBuilder<A, <d?, ?> b) {
        b.field3(instance.field3);
      }
      protected abstract @java.lang.Override @java.lang.SuppressWarnings("all") B self();
      public abstract @java.lang.Override @java.lang.SuppressWarnings("all") C build();
      public @java.lang.SuppressWarnings("all") B field3(final double field3) {
        this.field3 = field3;
        return self();
      }
      public @java.lang.Override @java.lang.SuppressWarnings("all") java.lang.String toString() {
        return (((("SuperBuilderWithGenericsAndToBuilder.Child.ChildBuilder(super=" + super.toString()) + ", field3=") + this.field3) + ")");
      }
    }
    private static final @java.lang.SuppressWarnings("all") class ChildBuilderImpl<A> extends ChildBuilder<A, Child<A>, ChildBuilderImpl<A>> {
      private ChildBuilderImpl() {
        super();
      }
      protected @java.lang.Override @java.lang.SuppressWarnings("all") ChildBuilderImpl<A> self() {
        return this;
      }
      public @java.lang.Override @java.lang.SuppressWarnings("all") Child<A> build() {
        return new Child<A>(this);
      }
    }
    double field3;
    protected @java.lang.SuppressWarnings("all") Child(final ChildBuilder<A, ?, ?> b) {
      super(b);
      this.field3 = b.field3;
    }
    public @java.lang.SuppressWarnings("all") ChildBuilder<A, ?, ?> toBuilder() {
      return new ChildBuilderImpl<A>().$fillValuesFrom(this);
    }
    public static @java.lang.SuppressWarnings("all") <A>ChildBuilder<A, ?, ?> builder() {
      return new ChildBuilderImpl<A>();
    }
  }
  public SuperBuilderWithGenerics() {
    super();
  }
  public static void test() {
    Child<Integer> x = Child.<Integer>builder().field3(0.0).field1(5).item("").build().toBuilder().build();
  }
}
