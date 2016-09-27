package com.salesforceiq;

public abstract class ParentSealedJava {

  private ParentSealedJava() {}

  public static final class ChildSealedJava extends ParentSealedJava {}

}
