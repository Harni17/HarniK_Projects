constmodal=document.getElementById("myModal");
constbtn=document.getElementById("myBtn");
constspan=document.getElementsByClassName("close")[0];
btn.onclick=function () {
  expName.value = "";
  expNumber.value = "";
  expenseForm.style.display = "block";
  editForm.style.display = "none";
  modal.style.display = "block";
};
span.onclick=function () {
  modal.style.display = "none";
};
window.onclick=function (event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
};

constamountInput=document.getElementById("number");
constaddForm=document.getElementById("addForm");
constbudgetAmount=document.getElementById("budgetAmount");
constbalanceAmount=document.getElementById("balanceAmount");

consteditForm=document.getElementById("editForm");
constsaveEdit=document.getElementById("saveEdit");
consteditExpValue=document.getElementById("editExpValue");
consteditExpNumber=document.getElementById("editExpNumber");

constexpForm=document.getElementById("expForm");
constexpensesAmount=document.getElementById("expensesAmount");
constexpValue=document.getElementById("expValue");
constdisplayExpenses=document.getElementById("displayExpenses");
constexpenseForm=document.getElementById("expense-form");
constbudgetform=document.getElementById("budgetform");

letexpName=document.getElementById("expName");
letexpNumber=document.getElementById("expNumber");
letid=0;
letdetails= [];

functiongetBudgetAmount(amount) {
  if (!amount) {
    amountInput.style.border = "1px solid #b80c09";
    amountInput.placeholder = "input can not be empty";
    amountInput.style.color = "#b80c09";
    setTimeout(() => {
      amountInput.style.color = "#495057";
      amountInput.style.border = "1px solid gray";
    }, 3000);
  } else {
    budgetAmount.innerText = amount;
    balanceAmount.innerText = amount;
    expenseForm.style.display = "block";
    budgetform.style.display = "none";
    editForm.style.display = "none";
    amountInput.value = "";
  }
}

functionaddExpenses(name, number) {
  if (!name.length || !number.length) {
    expName.style.border = "1px solid #b80c09";
    expName.placeholder = "input can not be empty";
    expName.style.color = "#b80c09";

    expNumber.style.border = "1px solid #b80c09";
    expNumber.placeholder = "input can not be empty";
    expNumber.style.color = "#b80c09";

    setTimeout(() => {
      expName.style.color = "#495057";
      expName.style.border = "1px solid gray";
      expName.placeholder = "input can not be empty";

      expNumber.placeholder = "input can not be empty";
      expNumber.style.border = "1px solid gray";
      expNumber.style.color = "#495057";
    }, 3000);
  } else {
    constuserExp = {
      id: id,
      name: name,
      number: parseInt(number),
    };
    details.push(userExp);
    displayExp(details);
    id++;
    expName.value = "";
    expNumber.value = "";
  }
}

functiondisplayExp(details) {
  expValue.innerHTML = null;
  for (i = 0; i<details.length; i++) {
    expValue.innerHTML += `
    <div class="expValue" id="${details[i].id}">
      <div id="expTitleName" class="exp"><p>${details[i].name}</p></div>
      <div id="expValueAmount" class="exp"><p><span>$ </span>${details[i].number}</p></div>
      <div id="edite_delete">
        <p>
          <button id="${details[i].id}" onclick="editExpDetails(${details[i].id})"><imgsrc="image/edit.svg" width="15" alt=""  /></button>
          <button id="${details[i].id}" onclick="delExpenseDetails(${details[i].id})"><imgsrc="image/trash.svg" width="15" alt="" /></button>
        </p>
      </div>
    </div>
  `;
  }
  calcExpenses();
  displayExpenses.style.display = "block";
}

functioncalcExpenses() {
  lettotalExp = 0;
  for (i = 0; i<details.length; i++) {
    totalExp = details[i].number + totalExp;
  }
  expensesAmount.innerText = totalExp;
  updateBalance();
}

functionupdateBalance() {
  balanceAmount.innerText =
    parseInt(budgetAmount.innerText) - parseInt(expensesAmount.innerText);
}

functiondelExpenseDetails(id) {
  letindex = details.findIndex((item) =>item.id === id);
  details.splice(index, 1);
  displayExp(details);
}

functioneditExpDetails(id) {
  expenseForm.style.display = "none";
  budgetform.style.display = "none";
  editForm.style.display = "block";
  details.findIndex((item) => {
    if (item.id === id) {
      editExpName.value = item.name;
      editExpNumber.value = item.number;
      saveEdit.children[2].id = item.id;
      modal.style.display = "block";
    }
  });
}

functiongetExpValue(editExpName, editExpNumber, id) {
  edited = details.findIndex((obj) =>obj.id == id);
  details[edited].name = editExpName;
  details[edited].number = parseInt(editExpNumber);
  displayExp(details);
}

functioncallBudget() {
  budgetform.style.display = "block";
  expenseForm.style.display = "none";
}

saveEdit.addEventListener("submit", (e) => {
  e.preventDefault();
  getExpValue(editExpName.value, editExpNumber.value, saveEdit.children[2].id);
});

expForm.addEventListener("submit", (e) => {
  e.preventDefault();
  addExpenses(expName.value, expNumber.value);
});

addForm.addEventListener("submit", (e) => {
  e.preventDefault();
  getBudgetAmount(amountInput.value);
});
