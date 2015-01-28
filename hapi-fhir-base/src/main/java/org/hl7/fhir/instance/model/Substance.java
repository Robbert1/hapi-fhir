package org.hl7.fhir.instance.model;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2015 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sun, Dec 7, 2014 21:45-0500 for FHIR v0.3.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.instance.model.annotations.ResourceDef;
import org.hl7.fhir.instance.model.annotations.SearchParamDefinition;
import org.hl7.fhir.instance.model.annotations.Block;
import org.hl7.fhir.instance.model.annotations.Child;
import org.hl7.fhir.instance.model.annotations.Description;
/**
 * A homogeneous material with a definite composition.
 */
@ResourceDef(name="Substance", profile="http://hl7.org/fhir/Profile/Substance")
public class Substance extends DomainResource {

    @Block()
    public static class SubstanceInstanceComponent extends BackboneElement {
        /**
         * Identifier associated with the package/container (usually a label affixed directly).
         */
        @Child(name="identifier", type={Identifier.class}, order=1, min=0, max=1)
        @Description(shortDefinition="Identifier of the package/container", formalDefinition="Identifier associated with the package/container (usually a label affixed directly)." )
        protected Identifier identifier;

        /**
         * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
         */
        @Child(name="expiry", type={DateTimeType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="When no longer valid to use", formalDefinition="When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry." )
        protected DateTimeType expiry;

        /**
         * The amount of the substance.
         */
        @Child(name="quantity", type={Quantity.class}, order=3, min=0, max=1)
        @Description(shortDefinition="Amount of substance in the package", formalDefinition="The amount of the substance." )
        protected Quantity quantity;

        private static final long serialVersionUID = -1474380480L;

      public SubstanceInstanceComponent() {
        super();
      }

        /**
         * @return {@link #identifier} (Identifier associated with the package/container (usually a label affixed directly).)
         */
        public Identifier getIdentifier() { 
          if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubstanceInstanceComponent.identifier");
            else if (Configuration.doAutoCreate())
              this.identifier = new Identifier();
          return this.identifier;
        }

        public boolean hasIdentifier() { 
          return this.identifier != null && !this.identifier.isEmpty();
        }

        /**
         * @param value {@link #identifier} (Identifier associated with the package/container (usually a label affixed directly).)
         */
        public SubstanceInstanceComponent setIdentifier(Identifier value) { 
          this.identifier = value;
          return this;
        }

        /**
         * @return {@link #expiry} (When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.). This is the underlying object with id, value and extensions. The accessor "getExpiry" gives direct access to the value
         */
        public DateTimeType getExpiryElement() { 
          if (this.expiry == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubstanceInstanceComponent.expiry");
            else if (Configuration.doAutoCreate())
              this.expiry = new DateTimeType();
          return this.expiry;
        }

        public boolean hasExpiryElement() { 
          return this.expiry != null && !this.expiry.isEmpty();
        }

        public boolean hasExpiry() { 
          return this.expiry != null && !this.expiry.isEmpty();
        }

        /**
         * @param value {@link #expiry} (When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.). This is the underlying object with id, value and extensions. The accessor "getExpiry" gives direct access to the value
         */
        public SubstanceInstanceComponent setExpiryElement(DateTimeType value) { 
          this.expiry = value;
          return this;
        }

        /**
         * @return When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
         */
        public Date getExpiry() { 
          return this.expiry == null ? null : this.expiry.getValue();
        }

        /**
         * @param value When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
         */
        public SubstanceInstanceComponent setExpiry(Date value) { 
          if (value == null)
            this.expiry = null;
          else {
            if (this.expiry == null)
              this.expiry = new DateTimeType();
            this.expiry.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #quantity} (The amount of the substance.)
         */
        public Quantity getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubstanceInstanceComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new Quantity();
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (The amount of the substance.)
         */
        public SubstanceInstanceComponent setQuantity(Quantity value) { 
          this.quantity = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("identifier", "Identifier", "Identifier associated with the package/container (usually a label affixed directly).", 0, java.lang.Integer.MAX_VALUE, identifier));
          childrenList.add(new Property("expiry", "dateTime", "When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.", 0, java.lang.Integer.MAX_VALUE, expiry));
          childrenList.add(new Property("quantity", "Quantity", "The amount of the substance.", 0, java.lang.Integer.MAX_VALUE, quantity));
        }

      public SubstanceInstanceComponent copy() {
        SubstanceInstanceComponent dst = new SubstanceInstanceComponent();
        copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.expiry = expiry == null ? null : expiry.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        return dst;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (expiry == null || expiry.isEmpty())
           && (quantity == null || quantity.isEmpty());
      }

  }

    @Block()
    public static class SubstanceIngredientComponent extends BackboneElement {
        /**
         * The amount of the ingredient in the substance - a concentration ratio.
         */
        @Child(name="quantity", type={Ratio.class}, order=1, min=0, max=1)
        @Description(shortDefinition="Optional amount (concentration)", formalDefinition="The amount of the ingredient in the substance - a concentration ratio." )
        protected Ratio quantity;

        /**
         * Another substance that is a component of this substance.
         */
        @Child(name="substance", type={Substance.class}, order=2, min=1, max=1)
        @Description(shortDefinition="A component of the substance", formalDefinition="Another substance that is a component of this substance." )
        protected Reference substance;

        /**
         * The actual object that is the target of the reference (Another substance that is a component of this substance.)
         */
        protected Substance substanceTarget;

        private static final long serialVersionUID = -1783242034L;

      public SubstanceIngredientComponent() {
        super();
      }

      public SubstanceIngredientComponent(Reference substance) {
        super();
        this.substance = substance;
      }

        /**
         * @return {@link #quantity} (The amount of the ingredient in the substance - a concentration ratio.)
         */
        public Ratio getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubstanceIngredientComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new Ratio();
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (The amount of the ingredient in the substance - a concentration ratio.)
         */
        public SubstanceIngredientComponent setQuantity(Ratio value) { 
          this.quantity = value;
          return this;
        }

        /**
         * @return {@link #substance} (Another substance that is a component of this substance.)
         */
        public Reference getSubstance() { 
          if (this.substance == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubstanceIngredientComponent.substance");
            else if (Configuration.doAutoCreate())
              this.substance = new Reference();
          return this.substance;
        }

        public boolean hasSubstance() { 
          return this.substance != null && !this.substance.isEmpty();
        }

        /**
         * @param value {@link #substance} (Another substance that is a component of this substance.)
         */
        public SubstanceIngredientComponent setSubstance(Reference value) { 
          this.substance = value;
          return this;
        }

        /**
         * @return {@link #substance} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Another substance that is a component of this substance.)
         */
        public Substance getSubstanceTarget() { 
          if (this.substanceTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubstanceIngredientComponent.substance");
            else if (Configuration.doAutoCreate())
              this.substanceTarget = new Substance();
          return this.substanceTarget;
        }

        /**
         * @param value {@link #substance} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Another substance that is a component of this substance.)
         */
        public SubstanceIngredientComponent setSubstanceTarget(Substance value) { 
          this.substanceTarget = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("quantity", "Ratio", "The amount of the ingredient in the substance - a concentration ratio.", 0, java.lang.Integer.MAX_VALUE, quantity));
          childrenList.add(new Property("substance", "Reference(Substance)", "Another substance that is a component of this substance.", 0, java.lang.Integer.MAX_VALUE, substance));
        }

      public SubstanceIngredientComponent copy() {
        SubstanceIngredientComponent dst = new SubstanceIngredientComponent();
        copyValues(dst);
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.substance = substance == null ? null : substance.copy();
        return dst;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (quantity == null || quantity.isEmpty()) && (substance == null || substance.isEmpty())
          ;
      }

  }

    /**
     * A code (or set of codes) that identify this substance.
     */
    @Child(name="type", type={CodeableConcept.class}, order=-1, min=1, max=1)
    @Description(shortDefinition="What kind of substance this is", formalDefinition="A code (or set of codes) that identify this substance." )
    protected CodeableConcept type;

    /**
     * A description of the substance - its appearance, handling requirements, and other usage notes.
     */
    @Child(name="description", type={StringType.class}, order=0, min=0, max=1)
    @Description(shortDefinition="Textual description of the substance, comments", formalDefinition="A description of the substance - its appearance, handling requirements, and other usage notes." )
    protected StringType description;

    /**
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
     */
    @Child(name="instance", type={}, order=1, min=0, max=1)
    @Description(shortDefinition="If this describes a specific package/container of the substance", formalDefinition="Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance." )
    protected SubstanceInstanceComponent instance;

    /**
     * A substance can be composed of other substances.
     */
    @Child(name="ingredient", type={}, order=2, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Composition information about the substance", formalDefinition="A substance can be composed of other substances." )
    protected List<SubstanceIngredientComponent> ingredient;

    private static final long serialVersionUID = 1881086620L;

    public Substance() {
      super();
    }

    public Substance(CodeableConcept type) {
      super();
      this.type = type;
    }

    /**
     * @return {@link #type} (A code (or set of codes) that identify this substance.)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Substance.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept();
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (A code (or set of codes) that identify this substance.)
     */
    public Substance setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #description} (A description of the substance - its appearance, handling requirements, and other usage notes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Substance.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType();
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A description of the substance - its appearance, handling requirements, and other usage notes.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Substance setDescriptionElement(StringType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A description of the substance - its appearance, handling requirements, and other usage notes.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A description of the substance - its appearance, handling requirements, and other usage notes.
     */
    public Substance setDescription(String value) { 
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #instance} (Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.)
     */
    public SubstanceInstanceComponent getInstance() { 
      if (this.instance == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Substance.instance");
        else if (Configuration.doAutoCreate())
          this.instance = new SubstanceInstanceComponent();
      return this.instance;
    }

    public boolean hasInstance() { 
      return this.instance != null && !this.instance.isEmpty();
    }

    /**
     * @param value {@link #instance} (Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.)
     */
    public Substance setInstance(SubstanceInstanceComponent value) { 
      this.instance = value;
      return this;
    }

    /**
     * @return {@link #ingredient} (A substance can be composed of other substances.)
     */
    public List<SubstanceIngredientComponent> getIngredient() { 
      if (this.ingredient == null)
        this.ingredient = new ArrayList<SubstanceIngredientComponent>();
      return this.ingredient;
    }

    public boolean hasIngredient() { 
      if (this.ingredient == null)
        return false;
      for (SubstanceIngredientComponent item : this.ingredient)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #ingredient} (A substance can be composed of other substances.)
     */
    // syntactic sugar
    public SubstanceIngredientComponent addIngredient() { //3
      SubstanceIngredientComponent t = new SubstanceIngredientComponent();
      if (this.ingredient == null)
        this.ingredient = new ArrayList<SubstanceIngredientComponent>();
      this.ingredient.add(t);
      return t;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "A code (or set of codes) that identify this substance.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("description", "string", "A description of the substance - its appearance, handling requirements, and other usage notes.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("instance", "", "Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.", 0, java.lang.Integer.MAX_VALUE, instance));
        childrenList.add(new Property("ingredient", "", "A substance can be composed of other substances.", 0, java.lang.Integer.MAX_VALUE, ingredient));
      }

      public Substance copy() {
        Substance dst = new Substance();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.description = description == null ? null : description.copy();
        dst.instance = instance == null ? null : instance.copy();
        if (ingredient != null) {
          dst.ingredient = new ArrayList<SubstanceIngredientComponent>();
          for (SubstanceIngredientComponent i : ingredient)
            dst.ingredient.add(i.copy());
        };
        return dst;
      }

      protected Substance typedCopy() {
        return copy();
      }

      public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (description == null || description.isEmpty())
           && (instance == null || instance.isEmpty()) && (ingredient == null || ingredient.isEmpty())
          ;
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Substance;
   }

  @SearchParamDefinition(name="substance", path="Substance.ingredient.substance", description="A component of the substance", type="reference" )
  public static final String SP_SUBSTANCE = "substance";
  @SearchParamDefinition(name="quantity", path="Substance.instance.quantity", description="Amount of substance in the package", type="number" )
  public static final String SP_QUANTITY = "quantity";
  @SearchParamDefinition(name="type", path="Substance.type", description="The type of the substance", type="token" )
  public static final String SP_TYPE = "type";
  @SearchParamDefinition(name="identifier", path="Substance.instance.identifier", description="Identifier of the package/container", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
  @SearchParamDefinition(name="expiry", path="Substance.instance.expiry", description="When no longer valid to use", type="date" )
  public static final String SP_EXPIRY = "expiry";

}
