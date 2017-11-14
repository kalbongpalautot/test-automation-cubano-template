package org.concordion.cubano.domain;

public enum Role {
	MANAGER("Service Manager"), OA("Operations Analyst"), PROCESSOR("Processor"), NONE("");

	private String label;

	private Role(String label) {
		this.label = label;
	}

	/**
	 * Returns role matching supplied role name.
	 * @param roleName Requested role
	 * @return Role
	 * @throws IllegalArgumentException if role not found
	 */
	public static Role fromRole(String roleName) {
		for (Role role : Role.values()) {
			if (roleName.equalsIgnoreCase(role.toString())) {
				return role;
			}
		}

		if (roleName.equalsIgnoreCase("Operational Analyst")) {
			return Role.OA;
		}

		throw new IllegalArgumentException(String.format("Role '%s' was not found", roleName));
	}

	public String label() {
		return label;
	}
}